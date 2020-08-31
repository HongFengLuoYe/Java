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
            File f1 = new File("D:\\工具\\83.0.4103.61_chrome_installer.exe");
            File f2 = new File("D:\\work\\83.0.4103.61_chrome_installer.exe");
            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);
            byte[] tmp = new byte[8912];
            int lenght = fis.available()/8912;
            for (int i=0;i<lenght;i++)
            {
                fis.read(tmp);
                fos.write(tmp);
            }
            int size = fis.read(tmp);
            fos.write(tmp,0,size);
        }catch (Exception e){}


    }



}
