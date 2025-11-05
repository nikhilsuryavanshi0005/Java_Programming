import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin
{
    public MarvellousLogin(String Title,int width,int height)
    {
        JFrame fobj = new JFrame(Title);

        fobj.setSize(width,height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class LoginFrame2
{
s    public static void main(String Arr[]) 
    {
        MarvellousLogin mobj = new MarvellousLogin("Login",500,300);
    }
}