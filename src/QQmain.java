import javax.swing.*;
import java.awt.*;

public class QQmain
{
    public static void main(String[] args)
    {
        JFrame w = new JFrame();
        w.setSize(300,400);

        //输入框
        JTextField input = new JTextField();
        //下拉框
        JComboBox box = new JComboBox();
        //发送按钮
        JButton sentBt = new JButton("发送");
        //滚动区域
        JTextArea area = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(area);

        //布局小面板
        JPanel smallPanel = new JPanel();
        smallPanel.setLayout(new GridLayout(1,2));
        smallPanel.add(box);
        smallPanel.add(sentBt);

        //布局大面板
        JPanel bigPanel = new JPanel();
        bigPanel.setLayout(new BorderLayout());
        bigPanel.add(input,BorderLayout.NORTH);
        bigPanel.add(smallPanel,BorderLayout.CENTER);

        //布局窗体
        w.setLayout(new BorderLayout());
        w.add(bigPanel,BorderLayout.NORTH);
        w.add(scrollPane,BorderLayout.CENTER);

        w.setVisible(true);
    }
}