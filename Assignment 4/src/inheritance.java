import java.util.Scanner;
class Calculator
{
    int i,j,sum,sub,multi,div;

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        i = sc.nextInt();
        System.out.print("Enter the second number : ");
        j = sc.nextInt();
    }
    public int Sum()    {return i+j;}

    public int Subs()   {return i-j;}

    public int Mul()    {return i*j;}

    public int Div()    {return i/j;}

}
class Advanced_Calculator extends Calculator
{
    public int avg()
    {
        int Avg;
        Avg = (sum+sub+multi+div)/4;
        return Avg;
    }
}
public class inheritance
{
    public static void main(String[] args)
    {
        Advanced_Calculator Object_Calculator = new Advanced_Calculator();
        Object_Calculator.input();
        System.out.println("Sum of the given elements is : "+Object_Calculator.Sum());
        System.out.println("Multiplication of the given elements is : "+Object_Calculator.Mul());
        System.out.println("Division of the given elements is : "+Object_Calculator.Div());
        System.out.println("Subtraction : "+Object_Calculator.Subs());
        System.out.println("The Average is : "+Object_Calculator.avg());
    }
}
