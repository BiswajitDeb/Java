import java.util.Scanner;

public class Method_Overloading
{
    void sum(int a,int b)
    {
        System.out.println("The sum is : " +(a+b));
    }
    void sum(int a,int b,int c)
    {
        System.out.println("The sum is : " +(a+b+c));
    }

    public static void main(String args[])
    {
        Method_Overloading obj = new Method_Overloading();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        obj.sum(sc.nextInt(),sc.nextInt());
        System.out.println("Enter three numbers : ");
        obj.sum(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
}