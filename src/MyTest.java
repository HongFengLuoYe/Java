import javax.swing.*;
import java.awt.*;

public class MyTest
{
    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(1024,768);
        w.getContentPane().setBackground(Color.black);

        MyPanel mp  = new MyPanel();
        w.getContentPane().add(mp);
        mp.setOpaque(false);//画板组件透明

        w.setVisible(true);
    }

}
class MyPanel extends JPanel
{

    public void paint(Graphics g)
    {

        g.setColor(Color.orange);
        g.fillOval(30,10,100,100);
        g.setColor(Color.black);
        g.fillOval(0,10,100,100);


        for (int i=0;i<=300;i++)
        {

            g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
            g.drawString("*",(int)(Math.random()*1024),(int)(Math.random()*768));
        }

    }
}