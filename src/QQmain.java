import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class QQmain extends JFrame implements ActionListener
{
    JTextField input;
    JTextArea area;
    JButton sentBt;
    public QQmain()
    {
        //组件
        input = new JTextField();
        JComboBox box = new JComboBox();
        sentBt = new JButton("发送");
        area = new JTextArea();
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

        readMessage();
        registerActionEvent();


    }
    private void sentMessage()
    {
        if (input.getText() != null && !input.getText().equals(""))
        {
            area.append(input.getText()+"\n");
        }
    }
    private void saveMessage()
    {
        try
        {
            File qq = new File("D:\\work\\聊天记录.qq");
            FileWriter fw = new FileWriter(qq,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(input.getText());
            pw.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
    private void readMessage()
    {
        try
        {
            File qq = new File("D:\\work\\聊天记录.qq");
            FileReader fr = new FileReader(qq);
            BufferedReader br = new BufferedReader(fr);
            while(br.ready())
            {
                area.append(br.readLine()+"\n");
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    private void blankMessage()
    {
        input.setText(null);
    }
    private void registerActionEvent()
    {
        sentBt.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        sentMessage();
        saveMessage();
        blankMessage();
    }


}