import java.util.Scanner;

class shift
{
    Scanner sc = new Scanner(System.in);
    int n,count=0;
    int arr[]=new int[100];

    public int[] input()
    {
        System.out.print("Enter array size : ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        return arr;
    }

    public void shift_zero()
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        while (count<n)
            arr[count++]=0;
    }

    public void display()
    {
        System.out.println("The final array is now : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class shifting_zero
{
    public static void main(String[] args)
    {
        shift ob1 = new shift();
        ob1.input();
        ob1.shift_zero();
        ob1.display();
    }
}
