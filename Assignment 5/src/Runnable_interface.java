class Thread_Runnable implements Runnable
{
    public
    void run()
    {
        System.out.println("thread is running...");
    }
    public static void main(String args[])
    {
        Thread_Runnable m1 = new Thread_Runnable();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
