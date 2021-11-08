import java.util.Scanner;

class armstrong
{
    int k;

    int sqrsum=0;
    Scanner sc = new Scanner(System.in);

    public void input()
    {
        System.out.printf("Enter a number : ");
        k=sc.nextInt();
    }


    public int sqrcount()
    {
        int n=k;
        while(n>0)
        {
            sqrsum += Math.pow(n%10,3);
            n/=10;
        }
        return sqrsum;
    }
    public void armcheck()
    {
        if(sqrsum==k)
        {
            System.out.println("Armstrong");
        }
        else
            System.out.println("Not Armstrong");;
    }

}

public class armstrongnumber
{
    public static void main(String[] args)
    {
        armstrong ob=new armstrong();
        ob.input();
        ob.sqrcount();
        ob.armcheck();
    }
}
