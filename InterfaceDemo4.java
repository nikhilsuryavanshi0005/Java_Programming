interface A
{
    void fun();
}

interface B
{
    void gun();
}

class Demo implements A,B   //Multiple inheritance   
{
    public void fun()
    {
        System.out.println("Inside Fun");
    }
    public void gun()
    {
        System.out.println("Inside Gun");
    }
}

class InterfaceDemo4
{
    public static void main(String Arr[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
    }
}