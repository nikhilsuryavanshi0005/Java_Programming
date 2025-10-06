interface A
{
    int no = 11;
    void fun();  
    private void Display()
    {
        System.out.println("Inside the Private Display");
    }  

    default void gun()  //its Concrete Method it is possible if the java version is 8+
    {
        System.out.println("Inside Gun");
        Display();      // it is the HElper Method(Means we call the method inside the same class method which is default)
    }
    

}

class Demo implements A   //Multiple inheritance   
{
    public void fun()
    {
        System.out.println("Inside Fun");   
    }
    
}

class InterfaceDemo9
{
    public static void main(String Arr[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
        //dobj.Display();   //Error
        
    }
}