import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyTest
{
    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(1024,768);

        MyPanel mp = new MyPanel();
        w.add(mp);

        w.addMouseListener(mp);
        mp.addMouseListener(mp);

        w.setVisible(true);
    }
}
class MyPanel extends JPanel implements MouseListener
{
    Boolean clicked = true;
    public void paint(Graphics g)
    {
        if (!clicked)
        {

            g.setColor(Color.black);
            g.drawLine(30,30,100,30);
            g.drawLine(30,30,30,80);
            g.setColor(Color.white);
            g.drawLine(100,30,100,80);
            g.drawLine(30,80,100,80);

        }
        else
        {
            g.setColor(Color.white);
            g.drawLine(30,30,100,30);
            g.drawLine(30,30,30,80);
            g.setColor(Color.black);
            g.drawLine(100,30,100,80);
            g.drawLine(30,80,100,80);
        }


    }
    public void mouseClicked(MouseEvent e)
    {

    }
    public void mousePressed(MouseEvent e)
    {
        if (e.getX() >=30 && e.getX()<=100 && e.getY() >=30 && e.getX()<=80)
        {
            clicked = !clicked;
            repaint();
        }

    }
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}