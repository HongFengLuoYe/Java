import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//extend
interface LoginSucceed
{
    public void processResponse();
}
class QQLogin extends JFrame implements ActionListener
{

    LoginSucceed loginSucceed;
    private JTextField userNameField;
    private JTextField passWordField;
    private JButton register;
    private JButton login;
    private JButton cancel;

    public QQLogin()
    {
        layoutUI();
        registerClick();
    }

    //UI
    private void layoutUI()
    {
        //组件
        JLabel userName = new JLabel("用户名:");
        JLabel passWord = new JLabel("密码:");
        userNameField = new JTextField();
        passWordField = new JTextField();
        register = new JButton("注册");
        login = new JButton("登录");
        cancel = new JButton("取消");

        //小面板布局
        JPanel smallPanel = new JPanel();
        smallPanel.setLayout(new FlowLayout());
        smallPanel.add(register);
        smallPanel.add(login);
        smallPanel.add(cancel);

        //大面板布局
        JPanel bigPanle = new JPanel();
        bigPanle.setLayout(new GridLayout(2,2));
        bigPanle.add(userName);
        bigPanle.add(userNameField);
        bigPanle.add(passWord);
        bigPanle.add(passWordField);

        //窗体布局
        this.setSize(100,150);
        this.setLayout(new BorderLayout());
        this.add(bigPanle,BorderLayout.NORTH);
        this.add(smallPanel,BorderLayout.SOUTH);
        this.setVisible(true);
    }

    // Event
    private void registerClick()
    {
        register.addActionListener(this);
        login.addActionListener(this);
        cancel.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("登录"))
        {
            if (userNameField.getText().equals("lizhangjun") && passWordField.getText().equals("ll"))
            {


                loginSucceed.processResponse();

            }
        }


    }


}


