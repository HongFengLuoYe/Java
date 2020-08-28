import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

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
            File f1 = new File("D:\\work\\test.txt");
            File f2 = new File("D:\\work\\test2.txt");
            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);
            while(fis.available()>0)
            {
                fos.write(fis.read());
            }

        }catch (Exception e){}


    }



}
