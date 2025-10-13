class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside the Run Method");
    }
}

class ThreadUserDefined2
{
    public static void main(String Arr[])
    {   
        System.out.println("Inside the main Thread");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        dobj1.start();
        dobj2.start();

        System.out.println("End of the main Thread");
    }
}