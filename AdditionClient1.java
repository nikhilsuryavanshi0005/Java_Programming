import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient1
{
    public static void main(String Brr[]) throws Exception
    {
        System.out.println("Client is Running.....");


        Socket sobj = new Socket("127.0.0.1",2100); // or localhast instead of 127.0.0.1
        System.out.println("Server Successfully Connected.....");
    }
}