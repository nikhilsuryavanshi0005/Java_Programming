import java.io.*;
import java.net.*;

class ChatClient
{
    public static void main(String Br[]) throws Exception
    {
        


        Socket sobj = new Socket("127.0.0.1",5100);
        System.out.println("Client gets Connected with Server Successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

    


        System.out.println("Enter Message for the Server");
        String str = bobj2.readLine();
        pobj.println(str);



        str = bobj1.readLine();
        System.out.println("Server say:"+str);
    }
}