public class Thread_By_Extending extends Thread
{
    public void thread_activation()
    {
        System.out.println("Thread has been activated");
    }

    public static void main(String[] args) {
        Thread_By_Extending ob1 = new Thread_By_Extending();
        ob1.thread_activation();
    }
}
