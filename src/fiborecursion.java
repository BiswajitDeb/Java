import java.util.Scanner;

class fibo
{
    Scanner sc=new Scanner(System.in);
    int n;
    public int input()
    {
        System.out.println("Enter number of terms you want to print : ");
        n= sc.nextInt();
        return n;
    }

    public static int fibcal(int n)
    {
        if(n==0)            {return 0;}
        if (n==1||n==2)     {return 1;}
        return fibcal(n-1)+fibcal(n-2);
    }

}

public class fiborecursion
{
    public static void main(String[] args)
    {
        fibo ob1=new fibo();
        int k= ob1.input();
        for(int i=0;i<k;i++)
        {
            System.out.printf(ob1.fibcal(i)+ " ");
        }
    }
}
