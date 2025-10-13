

class Demo extends Thread
{
    public void run() 
    {
        int i =0;
        try
        {
            for(i = 1; i <= 5; i++)
            {

                Thread.sleep(1000);
                System.out.println("Inside the Run Method of :"+Thread.currentThread().getName());
            }
        }

        catch(InterruptedException xobj)
        {

        }
    }
}

class ThreadUserDefinedSleepX
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
            dobj2.start(); 

            dobj1.join();  
            dobj2.join();
            
        }

        catch(InterruptedException iobj)
        {
            
        }


        System.out.println("End of the main Thread");
    }
}