import javax.swing.*;
import java.awt.*;

public class MyTest
{
    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(100,200);
        JButton bt1 = new JButton("1");
        JButton bt2 = new JButton("2");
        JButton bt3 = new JButton("388888888888888");
        JButton bt4 = new JButton("4");
        JButton bt5 = new JButton("5");

        w.setLayout(new GridLayout(3,2));
        w.add(bt1);
        w.add(bt2);
        w.add(bt3);
        w.add(bt4);
        w.add(bt5);


        w.setVisible(true);

    }
}