class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside the Run Method of :"+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinSerialAlive
{
    public static void main(String Arr[])
    {   
        System.out.println("Inside the main Thread");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");
        //Checked Exception
        try
        {
            dobj1.start();
            System.out.println("The First Thread is till Alive?"+dobj1.isAlive());
            dobj1.join();
            System.out.println("End of First Thread");

            System.out.println("The First Thread is till Alive?"+dobj1.isAlive());
            dobj2.start();    
            dobj2.join();
            System.out.println("End of Second Thread");

        }

        catch(InterruptedException iobj)
        {
            
        }


        System.out.println("End of the main Thread");
    }
}