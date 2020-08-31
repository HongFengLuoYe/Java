import java.io.*;

public class Controller
{
    public static void main(String[] args)
    {
        stringStream();
    }
    public static void stringStream()
    {
        try
        {
            File f1 = new File("D:\\work\\test.txt");
            File f2 = new File("D:\\work\\test2.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(f2);
            PrintWriter pw = new PrintWriter(fw);
            while (br.ready())
            {
                pw.println(br.readLine());
            }
            pw.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

//    public static void login()
//    {
//        //登陆界面
//        QQLogin loginInterface = new QQLogin();
//        //登录成功后
//        loginInterface.loginSucceed = () ->
//        {
//            loginInterface.setVisible(false);
//            QQmain  mainInterface = new QQmain();
//        };
//    }



}
