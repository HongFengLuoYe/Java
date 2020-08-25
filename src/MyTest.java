import javax.swing.*;
import java.awt.*;

public class MyTest
{
    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(600,600);

        MyPanel mp = new MyPanel();
        w.add(mp);

        Thread t = new Thread(mp);
        t.start();
        w.setVisible(true);

    }
}
class MyPanel extends JPanel implements Runnable
{
    int att  =0;
    int x = 100;
    int y = 20;


    Color c = new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(c);
        g.fillOval(x,y,50,50);
    }
    public void run()
    {
        while (true)
        {
            //定义飞行状态
            if(att==0)
            {
                x++;
                y++;

            }else if(att==1)
            {
                x--;
                y++;
            }else if(att==2)
            {
                x--;
                y--;
            }else if(att==3)
            {
                x++;
                y--;
            }
            //改变飞行状态
            if (x>540)
            {
                c = new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
                if (att==0)
                {
                    att=1;
                }
                else
                {
                    att=2;
                }
            }
            if (y>520)
            {
                c = new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
                if (att==1)
                {
                    att=2;
                }
                else
                {
                    att=3;
                }
            }
            if (x<0)
            {
                c = new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
                if (att==2)
                {
                    att=3;
                }
                else
                {
                    att=0;
                }
            }
            if (y<0)
            {
                c = new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random()));
                if (att==3)
                {
                    att=0;
                }
                else
                {
                    att=1;
                }
            }
            try
            {
                Thread.sleep(10);
            }catch (Exception e){}
            repaint();
        }


    }
}
