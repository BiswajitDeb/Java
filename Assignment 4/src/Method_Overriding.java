class A
{
    int i;
    public void display()
    {
        System.out.println("This function is inside A : ");
    }
}
class B extends A
{
    int i;
    public void display()
    {
        i = 12;
        super.i = 96;
        System.out.println("This function is inside B : ");
    }
    public void update_display()
    {
        System.out.println("Sum : "+(i+super.i));
    }
}
public class Method_Overriding
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.display();
        obj.update_display();
    }
}
