import java.util.*;

class ExceptionDemo7
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter The First Number");
        iNo1 = sobj.nextInt();
        
        System.out.println("Enter The Second Number");
        iNo2 = sobj.nextInt();
        try
        {
            System.out.println("Inside the Try Block");
            iAns = iNo1 / iNo2;   
        }
        System.out.println("Hello");    //Error
        catch(ArithmeticException aobj)     //Specific Catch
        {
            System.out.println("Inside the Catch Block");
            System.out.println(aobj);
        }
        catch(Exception eobj)       // Generic Catch(It will catch all Problems)
        {
            System.out.println("Inside the Generic Catch");
        }
        finally
        {
            System.out.println("Inside the Finally Block");
        }
        System.out.println("Enter Division Number is "+iAns);
        
    }
}