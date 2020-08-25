import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyTest
{
    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(1024,768);

        MyPanel mp = new MyPanel();
        w.add(mp);

        w.addKeyListener(mp);
        mp.addKeyListener(mp);
        w.setVisible(true);
    }
}
class MyPanel extends JPanel implements KeyListener
{
    int x = 30;
    int y = 30;

    public void paint(Graphics g)
    {
        super.paint(g);
        g.fillOval(x,y,50,50);
    }

    public void keyTyped(KeyEvent e)
    {

    }


    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode()==37)
        {
            x--;
        }
        if (e.getKeyCode()==38)
        {
            y--;
        }
        if (e.getKeyCode()==39)
        {
            x++;
        }
        if (e.getKeyCode()==40)
        {
            y++;
        }
        repaint();
    }


    public void keyReleased(KeyEvent e)
    {


    }
}