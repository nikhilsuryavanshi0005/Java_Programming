import java.util.Scanner;

class Selectiondemo1
{
    public static void main(String Ar[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iNo = 0;

        System.out.println("Enter Your Age :");
        iNo = Sobj.nextInt();

        if(iNo>= 18)
        {
            System.out.println("You are Eligible For Voting");
        }
        else
        {
            System.out.println("You Are Not Eligible for Voting");
        }
        
    }
}