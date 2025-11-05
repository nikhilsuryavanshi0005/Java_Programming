import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLabel Userlabel,Passlabel,Resultlabel;

    public MarvellousLogin(String Title,int width,int height)
    {
        
        fobj = new JFrame(Title);
        fobj.setSize(width,height);

        Userlabel = new JLabel("User Name");
        Userlabel.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(50,90,100,30);

        Passlabel = new JLabel("Password");
        Passlabel.setBounds(70,100,100,30);

        pobj = new JPasswordField();
        pobj.setBounds(150,100,150,30);

        bobj = new JButton("Submit");
        bobj.setBounds(200,150,100,30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150,200,200,50);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(Resultlabel);
        fobj.add(Userlabel);
        fobj.add(Passlabel);

        bobj.addActionListener(this);
        fobj.setSize(400,300);



        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent aobj)
    {
        Resultlabel.setText("Button Clicked");
    }
}

class LoginFrame3
{
    public static void main(String Arr[]) 
    {
        MarvellousLogin mobj = new MarvellousLogin("Login",400,300);
    }
}