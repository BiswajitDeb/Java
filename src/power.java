import java.util.Scanner;

public class power {

    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        if((n&(n-1))==0)
            System.out.println("Power of two");
        else {
            System.out.println("Not power of two");
        }
        }
    }

