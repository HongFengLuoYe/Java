import javax.swing.*;
import java.awt.*;
class QQmain extends JFrame
{
    public QQmain()
    {
        //组件
        JTextField input = new JTextField();
        JComboBox box = new JComboBox();
        JButton sentBt = new JButton("发送");
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
        this.setSize(300,400);
        this.setLayout(new BorderLayout());
        this.add(bigPanel,BorderLayout.NORTH);
        this.add(scrollPane,BorderLayout.CENTER);
        this.setVisible(true);
    }
}