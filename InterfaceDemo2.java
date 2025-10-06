interface Demo
{
    int no = 11;
    void Display();
}

abstract class Hello implements Demo
{
    
}

class InterfaceDemo1
{
    public static void main(String Arr[])
    {
       Hello hobj = new Hello();  //Error
    }
}