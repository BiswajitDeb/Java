import java.util.Scanner;

class logics
{
    private int n,k;
    private int sum=0;

    public int input()
    {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        return n;
    }

    public int calculations()
    {
        k=n;
        while (k!=0)
        {
            sum=(sum*10)+(k%10);
            k/=10;
        }
        return sum;
    }

    public void check()
    {
        if(sum==n)
        {
            System.out.println("Input number is Palindrome");
        }
        else
        {
            System.out.println("Input number is not palindrome");
        }
    }

}

public class palindrome
{
    public static void main(String[] args)
    {
        logics ob1= new logics();
        ob1.input();
        ob1.calculations();
        ob1.check();
    }
}
