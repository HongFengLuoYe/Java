import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyTest
{
    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(1024,768);

        MyPanel mp = new MyPanel();
        w.add(mp);

        w.addMouseMotionListener(mp);
        mp.addMouseMotionListener(mp);

        w.setVisible(true);
    }
}
class MyPanel extends JPanel implements MouseMotionListener
{
    int x = 30;
    int y = 30;
    public void paint(Graphics g)
    {
        super.paint(g);
        g.fillOval(x,y,50,50);
    }
    public void mouseDragged(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        repaint();
    }
    public void mouseMoved(MouseEvent e)
    {

    }

}

