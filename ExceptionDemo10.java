import java.util.*;

class ExceptionDemo10
{
    public static void main(String Brr[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int Arr[] = {10,20,30,40,50};
        int iIndex = 0;
        int iData = 0;

        
        System.out.println("Enter The Index Number");
        iIndex = sobj.nextInt();
        
        try
        {
            System.out.println("Inside Try");
            iData = Arr[iIndex];        
            System.out.println("Element at that Index is : "+iData);
        }
        catch(Exception xobj)
        {
            System.out.println("Inside the Catch");
            System.out.println(xobj);
        }
        finally
        {
            System.out.println("Inside the Finally");
        }

    }
}