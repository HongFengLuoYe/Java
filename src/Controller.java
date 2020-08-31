import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Controller
{

    public static void main(String[] args)
    {

        encryption();
        decrypt();

    }
    public static void encryption()
    {
        try
        {
            File f1 = new File("D:\\work\\test.txt");
            File f2 = new File("D:\\work\\test2.txt");
            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);
            int length = fis.available();
            for (int i=0;i<length;i++)
            {
                fos.write(fis.read()+100);
            }

        }catch (Exception e){}
    }
    public static void decrypt()
    {
        try
        {
            File f1 = new File("D:\\work\\test2.txt");
            File f2 = new File("D:\\work\\test3.txt");
            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);
            int length = fis.available();
            for (int i=0;i<length;i++)
            {
                fos.write(fis.read()-100);
            }
        }catch (Exception e){}

    }

    public static void login()
    {
        //登陆界面
        QQLogin loginInterface = new QQLogin();
        //登录成功后
        loginInterface.loginSucceed = () ->
        {
            loginInterface.setVisible(false);
            QQmain  mainInterface = new QQmain();
        };
    }



}
