import java.io.File;
import java.io.FileInputStream;

public class Controller
{

    public static void main(String[] args)
    {
//        //登陆界面
//        QQLogin loginInterface = new QQLogin();
//        //登录成功后
//        loginInterface.loginSucceed = () ->
//        {
//           loginInterface.setVisible(false);
//           QQmain  mainInterface = new QQmain();
//       };
        try
        {
            File f = new File("D:\\work\\test.txt");
            FileInputStream fis = new FileInputStream(f);
            while(fis.available()>0)
            {
                System.out.println((char)fis.read());
            }

        }catch (Exception e){}


    }



}
