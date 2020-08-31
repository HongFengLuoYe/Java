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
            File f = new File("D:\\work\\test.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready())
            {
                System.out.println(br.readLine());
            }
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
