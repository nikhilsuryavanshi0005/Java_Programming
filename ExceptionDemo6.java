import java.util.*;

class ExceptionDemo6
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
        catch(Exception eobj)       // Generic Catch(It will catch all Problems) //Error Due the Sequence
        {
            System.out.println("Inside the Generic Catch");
        }
        catch(ArithmeticException aobj)     //Specific Catch
        {
            System.out.println("Inside the Catch Block");
            System.out.println(aobj);
        }
        
        System.out.println("Enter Division Number is "+iAns);
        
    }
}