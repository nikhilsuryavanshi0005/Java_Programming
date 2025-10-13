class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside the Run Method of :"+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinX
{
    public static void main(String Arr[]) throws InterruptedException
    {   
        System.out.println("Inside the main Thread");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();


        System.out.println("End of the main Thread");
    }
}