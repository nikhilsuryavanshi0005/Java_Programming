import java.util.Scanner;

class Inputoutput
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0;
        int No2 = 0;
        int Ans = 0;

        System.out.println("Enter First Number :");
        No1 = sobj.nextInt();

        System.out.println("Enter Second Number :");
        No2 = sobj.nextInt();

        Ans = No1 + No2;

        System.out.println("Addition:"+Ans);

    }
}