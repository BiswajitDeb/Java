import java.util.*;
class Num
{
    protected int num;
    void shownum()
    {
        System.out.println("The number is = "+this.num);
    }
}
class Hexnum extends Num
{
    Scanner sc = new Scanner(System.in);
    Hexnum()
    {
        System.out.println("Enter the number =");
        this.num = sc.nextInt();
    }
    void Hexcon()
    {
        int n=this.num,k=0;
        StringBuffer s = new StringBuffer();
        while(n!=0)
        {
            if(n%16==10)
                s.append('A');
            else if (n%16==11)
                s.append('B');
            else if (n%16==12)
                s.append('C');
            else if (n%16==13)
                s.append('D');
            else if (n%16==14)
                s.append('E');
            else if (n%16==15)
                s.append('F');
            else
                s.append(n%16);
            n =(int) n/16;
        }
        System.out.println("The Hexadecimal form of the given number is : "+s.reverse());
    }
}
public class Number_System
{
    public static void main(String[] args)
    {
        Num ob = new Num();
        ob.shownum();
        Hexnum obj = new Hexnum();
        obj.Hexcon();
    }
}