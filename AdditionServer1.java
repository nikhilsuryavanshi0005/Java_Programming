import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer1
{
    public static void main(String Brr[]) throws Exception
    {
        System.out.println("Server is Running.....");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is Waiting at Port Number : 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client is Arrives and Accepted by the Server");
    }
}