interface A
{
    int no = 11;
    void fun();     
    default void gun()  //its Concrete Method it is possible if the java version is 8+
    {
        System.err.println("Inside Gun");
    }
}

class Demo implements A   //Multiple inheritance   
{
    public void fun()
    {
        System.out.println("Inside Fun");   
    }
    
}

class InterfaceDemo8
{
    public static void main(String Arr[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
        
    }
}