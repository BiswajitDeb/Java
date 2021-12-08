class Demo
{
    public static void First_Method()
    {
        System.out.println("1st Method of the Demo class is executed.");
    }
    public void Second_Method()
    {
        System.out.println("2nd Method of the Demo class is executed.");
    }
}
public class Method_Hiding extends Demo
{
    public static void First_Method()
    {
        System.out.println("1st Method of the Method_Hiding class is executed.");
    }
    public void Second_Method()
    {
        System.out.println("2nd Method of the Method_Hiding class is executed.");
    }
    public static void main(String args[])
    {
        Demo d1 = new Demo();
        Demo d2 = new Method_Hiding();
        d1.First_Method();
        d2.First_Method();
        d1.Second_Method();
        d2.Second_Method();
    }
}