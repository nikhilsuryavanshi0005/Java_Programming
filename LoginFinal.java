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
        Userlabel.setBounds(50,60,100,40);

        Passlabel = new JLabel("Password");
        Passlabel.setBounds(50,100,100,40);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(100,200,150,40);

        tobj = new JTextField();
        tobj.setBounds(150,60,100,40);

        pobj = new JPasswordField();
        pobj.setBounds(150,100,100,40);

        bobj = new JButton("Submit");
        bobj.setBounds(200,150,100,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);

        fobj.add(Resultlabel);
        fobj.add(Userlabel);
        fobj.add(Passlabel);

        bobj.addActionListener(this);
        fobj.setSize(500,400);


        fobj.setSize(width,height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
    
        String username = tobj.getText();
        String password = new String(pobj.getPassword());

        if(username.equals("Nikhil") && password.equals("Nikhil@123"))
        {
            Resultlabel.setText("Login Success");
        }
        else
        {
            Resultlabel.setText("Invalid User");
        }
    }
    
}
class LoginFinal
{
    public static void main(String Arr[]) 
    {
        MarvellousLogin mobj = new MarvellousLogin("Login",500,400);
    }
}