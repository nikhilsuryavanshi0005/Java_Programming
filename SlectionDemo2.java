import java.util.Scanner;

class SelectionDemo2
{
    public static void main(String Ar[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iStd = 0;

        System.out.println("Enter Your Standard :");
        iStd = Sobj.nextInt();

        if(iStd==1)
        {
            System.out.println("Exam at 9 AM");
        }
        else if(iStd ==2)
        {
            System.out.println("Exam is at 10 AM");
        }
        else if(iStd ==3)
        {
            System.out.println("Exam is at 11 AM");
        }
        else if(iStd ==4)
        {
            System.out.println("Exam is at 12 Noon");
        }
        else
        {
            System.out.println("Invalid Standarad");
        }
    }
}