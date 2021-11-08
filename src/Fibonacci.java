import java.util.Scanner;

class Fibo
{
    Scanner sc =new Scanner(System.in);
    int n;
    int sum=0,num1=0,num2=1;
    public void input()
    {
        System.out.println("Enter number of terms you want to print : ");
        n= sc.nextInt();
    }

    public void fibocalculation()
    {
        System.out.println("The series is : ");
        for(int i=1;i<n;++i)
        {
            sum=num1+num2;
            System.out.printf(num2+ " ");
            num1=num2;
            num2=sum;
            //return sum;
        }
    }


}

public class Fibonacci
{
    public static void main(String[] args)
    {
        Fibo ob1 = new Fibo();
        ob1.input();
        ob1.fibocalculation();
    }
}
