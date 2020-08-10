import javax.swing.*;
import java.awt.*;
public class MyTest
{


    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(300,400);

        MyPanel mp = new MyPanel();
        w.add(mp);
        w.show();
    }
}
class MyPanel extends JPanel
{


    public void paint(Graphics g)
    {
        //头
        g.setColor(new Color(153,134,117));
        g.fillOval(133,10,32,47);
        g.setColor(Color.black);
        g.drawOval(133,10,32,47);

        //左眼睛
        g.setColor(Color.black);
        g.drawOval(133,23,9,9);
        g.setColor(Color.white);
        g.fillOval(133,23,8,8);
        g.setColor(Color.black);
        g.fillOval(137,25,5,5);

        //右眼睛
        g.setColor(Color.black);
        g.drawOval(153,23,9,9);
        g.setColor(Color.white);
        g.fillOval(153,23,8,8);
        g.setColor(Color.black);
        g.fillOval(157,25,5,5);

        //腿

        g.setColor(new Color(153,134,117));
        g.fillOval(75,75,32,47);
        g.fillOval(194,75,32,47);
        g.fillOval(85,160,32,47);
        g.fillOval(180,160,32,47);
        g.setColor(Color.black);
        g.drawOval(75,75,33,47);
        g.drawOval(194,75,32,47);
        g.drawOval(85,160,32,47);
        g.drawOval(180,160,32,47);

        //龟壳
        g.setColor(new Color(0,104,55));
        g.fillOval(94,41,110,161);
        g.setColor(Color.black);
        g.drawOval(94,41,110,161);


        //龟壳纹理
        g.setColor(Color.red);
        int [] xPoints2 = {131,167,185,167,131,113,131};
        int [] yPoints2 = {100,100,132,163,163,132,100};
        int nPoints2 = 7;
        g.fillPolygon(xPoints2, yPoints2, nPoints2);

        g.setColor(Color.black);
        g.drawPolygon(xPoints2, yPoints2, nPoints2);

        g.drawLine(131,100,105,75);
        g.drawLine(167,100,194,75);
        g.drawLine(185,132,204,132);
        g.drawLine(113,132,95,132);
        g.drawLine(131,163,115,184);
        g.drawLine(167,163,183,184);


        //尾巴
        g.setColor(new Color(153,134,117));
        int [] xPoints = {142,165,160,142};
        int [] yPoints = {200,225,199,200};
        int nPoints = 4;
        g.fillPolygon(xPoints, yPoints, nPoints);
        g.setColor(Color.black);
        g.drawPolygon(xPoints, yPoints, nPoints);

    }
}