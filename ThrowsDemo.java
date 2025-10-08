import java.util.*;
class Demo
{
    public int Division(int iNo1 , int iNo2) throws ArithmeticException
    {
        int iAns = 0;
        iAns = iNo1 / iNo2;
        return iAns;
    }
}
class ThrowsDemo
{
    public static void main(String Ar[])
    {
        
        Demo dobj = new Demo();

        int iRet = 0;
        try
        {
        iRet = dobj.Division(11,0);
        }
        catch(ArithmeticException xobj)
        {
            System.out.println("Inside the Catch");
        }

        System.out.println("Division is :"+iRet);
    }
}