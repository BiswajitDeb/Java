import java.util.Scanner;

class Fact
{
    Scanner sc=new Scanner(System.in);

    public int input()
    {
        int n;
        System.out.println("Enter a number to print it's factorial : ");
        n= sc.nextInt();
        return n;
    }

    public int factcal(int m)
    {
        if(m==0)    {return 1;}
        return m*factcal(m-1);
    }

}

public class Factorialrecursion
{
    public static void main(String[] args)
    {
        Fact ob1=new Fact();
        int k=ob1.input();
        System.out.println("The factorial is : "+ob1.factcal(k));
    }
}
