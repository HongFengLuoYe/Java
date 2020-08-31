import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Controller
{
    public static void main(String[] args)
    {
//        keyFile();
        encryption();
        decrypt();
    }
    public static void keyFile()
    {
        try
        {
            File key = new File("D:\\work\\key.key");
            FileOutputStream fos = new FileOutputStream(key);
            for (int i=0;i<128;i++)
            {
                fos.write((int)(Math.random()*128));
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    public static int[] getKeyFile()
    {
        int[] key = new int[128];
        try
        {
            File keyFile = new File("D:\\work\\key.key");
            FileInputStream keyFis = new FileInputStream(keyFile);
            for (int i=0;i<128;i++)
            {
                key[i] = keyFis.read();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return key;


    }
    public static void encryption()
    {
        try
        {

            File f1 = new File("D:\\work\\test.txt");
            File f2 = new File("D:\\work\\test2.txt");
            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);

            int key[] = Controller.getKeyFile();
            int length = fis.available();
            for (int i=0;i<length;i++)
            {
                fos.write(fis.read()+ key[i%128]);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void decrypt()
    {
        try
        {
            File f1 = new File("D:\\work\\test2.txt");
            FileInputStream fis = new FileInputStream(f1);
            int [] key = Controller.getKeyFile();
            int length = fis.available();
            for (int i=0;i<length;i++)
            {
                System.out.print((char)(fis.read()-key[i%128]));
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
