class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside the Run Method");
    }
}

class ThreadUserDefined1
{
    public static void main(String Arr[])
    {
        Demo dobj1 = new Demo();
        dobj1.start();
    }
}