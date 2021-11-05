import java.util.Scanner;

class primecheck
{
    int n;
    int count=0;
    public int input()
    {
        System.out.println("Enter a number to check whether it's prime or not : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        return n;
    }
    public void check_prime()
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count+=1;
            }
        }

        if(count>0)
        {
            System.out.println("The input number isn't Prime");
        }
        else System.out.println("The input number is prime");
    }
}

public class prime
{
    public static void main(String[] args)
    {
        primecheck ob1=new primecheck();
        ob1.input();
        ob1.check_prime();
    }
}
