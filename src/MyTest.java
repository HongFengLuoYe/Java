import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyTest
{
    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(1024,768);

        MyPanel mp = new MyPanel();
        w.add(mp);

        Thread t = new Thread(mp);
        t.start();

        w.addKeyListener(mp);
        mp.addKeyListener(mp);

        w.setVisible(true);
    }
}
class MyPanel extends JPanel implements Runnable, KeyListener
{
    int x[] = new int[26];
    int y[] = new int[26];
    String letter[] =new String[10];
    int score = 0;
    public MyPanel()
    {
        for(int i=0;i<10;i++)
        {
            x[i] = (int)(Math.random()*1024);
            y[i] = (int)(Math.random()*768);
            letter[i] = String.valueOf((char)(65+(int)(Math.random()*26)));

        }
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setFont(new Font("",0,60));
        for(int i=0;i<10;i++)
        {
            g.drawString(letter[i],x[i],y[i]);

        }
        g.setColor(Color.red);
        g.drawString("得分:" + score,30,80 );
    }

    public void run()
    {
        while (true)
        {
            for (int i=0;i<26;i++)
            {
                y[i]++;
                if(y[i]>768)
                {
                    y[i]=0;
                }

            }
            try
            {
                Thread.sleep(10);
            }catch (Exception e){}
            repaint();
        }
    }
    public void keyPressed(KeyEvent e)
    {
        int max = 0;
        int maxIndex = 10;
        for (int i=0;i<10;i++)
        {
            if (String.valueOf(e.getKeyChar()).toUpperCase().equals(letter[i]))
            {
                if (y[i]>max)
                {
                    max = y[i];
                    maxIndex = i;
                }
            }
        }
        if (maxIndex<10)
        {
            letter[maxIndex] = String.valueOf((char)(65+(int)(Math.random()*26)));
            x[maxIndex] = (int)(Math.random()*800);
            y[maxIndex] = 0;
            score += 2;
        }



    }
    public void keyTyped(KeyEvent e)
    {

    }
    public void keyReleased(KeyEvent e)
    {

    }

}