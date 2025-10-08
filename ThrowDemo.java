import java.util.*;

class AgeInvalidException extends Exception
{
    public AgeInvalidException(String str)
    {
        super(str);
    }
}
class ThrowDemo
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Age :");
        int iAge = sobj.nextInt();

        try
        {

            if(iAge < 18)
            {
                 throw new AgeInvalidException("Your Age is Below 18");
            }
        }
        catch(AgeInvalidException aobj)
        {
            System.out.println("Your Age is Below 18");
        }
    }
}