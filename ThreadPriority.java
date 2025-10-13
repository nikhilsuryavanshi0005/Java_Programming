class ThreadPriority
{
    public static void main(String Arr[])
    {
        System.out.println("Inside main method");
        Thread tobj = Thread.currentThread();
        String name  = tobj.getName();
        System.out.println("Nmae of current thread is : "+name);
        int Priority = tobj.getPriority();
        System.err.println("Priority of Current Thread is : "+tobj.getPriority());
        tobj.setPriority(10);
        Priority = tobj.getPriority();
        System.err.println("Priority of Current Thread is : "+tobj.getPriority());
    }
}