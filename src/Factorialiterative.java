import java.util.Scanner;

class fact
{
    Scanner sc =new Scanner(System.in);
    int n;
    int result=1;

    public void input()
    {
        System.out.println("Enter a number to print it's factorial : ");
        n = sc.nextInt();
        //return n;
    }

    public int fibologic()
    {

        for(int i=1;i<=n;i++)
        {
            result *=i;
        }
        return result;
    }
}

public class Factorialiterative
{
    public static void main(String[] args)
    {
        fact ob1=new fact();
        ob1.input();
        System.out.println("The factorial is : " + ob1.fibologic());

    }
}
