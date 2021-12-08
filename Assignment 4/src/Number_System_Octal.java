import java.util.*;
class Num1
{
    protected int num;
    void shownum()
    {
        System.out.println("The number is = "+this.num);
    }
}
class Octnum extends Num
{
    Scanner sc = new Scanner(System.in);
    Octnum()
    {
        System.out.print("Enter the number : ");
        this.num = sc.nextInt();
    }
    void shownum()
    {
        int n=this.num;
        StringBuffer s = new StringBuffer();
        int[] octalNum = new int[100];
        int i = 0;
        while (n != 0)
        {
            octalNum[i] = n % 8;
            n = n / 8;
            i++;
        }
        System.out.print("The number is : ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalNum[j]);
    }
}
public class Number_System_Octal
{
    public static void main(String[] args)
    {
        Num1 ob = new Num1();
        ob.shownum();
        Octnum obj = new Octnum();
        obj.shownum();
    }
}