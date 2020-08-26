import javax.swing.*;
import java.awt.*;

public class MyTest
{
    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(100,150);

        w.setLayout(new BorderLayout());
        BigPanel bigPanle = new BigPanel();
        SmallPanel smallPanel = new SmallPanel();

        w.add(bigPanle,BorderLayout.NORTH);
        w.add(smallPanel,BorderLayout.SOUTH);

        w.setVisible(true);

    }
}
class BigPanel extends JPanel
{
    public BigPanel()
    {
        this.setLayout(new GridLayout(2,2));
        JLabel userName = new JLabel("用户名:");
        JLabel passWord = new JLabel("密码:");
        JTextField userNameField = new JTextField();
        JTextField passWordField = new JTextField();

        this.add(userName);
        this.add(userNameField);
        this.add(passWord);
        this.add(passWordField);
    }
}
class SmallPanel extends JPanel
{
    public SmallPanel()
    {
        this.setLayout(new FlowLayout());
        JButton register = new JButton("注册");
        JButton login = new JButton("登录");
        JButton cancel = new JButton("取消");

        this.add(register);
        this.add(login);
        this.add(cancel);
    }
}