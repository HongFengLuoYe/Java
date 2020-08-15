import javax.swing.*;
import java.awt.*;

public class MyTest
{
    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(1024,768);
        w.getContentPane().setBackground(Color.black);

        MyPanel mp = new MyPanel();
        w.getContentPane().add(mp);
        mp.setOpaque(false);

        Thread t = new Thread(mp);
        t.start();

        w.setVisible(true);
    }
}
class MyPanel extends JPanel implements Runnable
{
    int x = 30;
    int y = 30;
    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillOval(x,y,50,50);
    }

    public void run()
    {
        while(true)
        {
            y++;
            if(y>=700)
            {
                y=0;
            }
            try
            {
                Thread.sleep(10);
            }catch (Exception e){};
            repaint();
        }

    }
}