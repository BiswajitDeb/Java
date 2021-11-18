import java.util.Arrays;
import java.util.Scanner;

class sorting_max_min
{
    Scanner sc = new Scanner(System.in);
    int n;
    int arr[]=new int[100];


    public void input()
    {
        System.out.print("Enter the length of the array : ");
        n=sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    int temp[] = new int[100];
    public void rearrange()
    {
        int small_num = 0, large_num = n-1;
        boolean flag = true;

        for (int i=0; i < n; i++)
        {
            if (flag)
                temp[i] = arr[large_num--];
            else
                temp[i] = arr[small_num++];

            flag = !flag;
        }

    }

    public void display()
    {
        System.out.println("The formatted array is now : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }

    
}

public class sorting_array_max_min
{
    public static void main(String[] args)
    {
        sorting_max_min  ob1 = new sorting_max_min();
        ob1.input();
        ob1.rearrange();
        ob1.display();
    }
}
