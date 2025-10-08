import java.util.*;

class ExceptionDemo2
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0;
        int iNo2 = 0;
        float fAns = 0.0f;

        System.out.println("Enter The First Number");
        iNo1 = sobj.nextInt();
        
        System.out.println("Enter The Second Number");
        iNo2 = sobj.nextInt();

        fAns = (float)iNo1 / (float)iNo2;   //Explicity added float

        System.out.println("Enter Division Number is "+fAns);
        
    }
}