public class Controller
{

    public static void main(String[] args)
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
