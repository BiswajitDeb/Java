import java.util.Scanner;

class difference
{
    Scanner sc = new Scanner(System.in);
    int greatest,smallest,n;

    public void arrays_size_input()
    {
        System.out.println("Enter array size : ");
        n=sc.nextInt();
    }

    int arr[] = new int[100];

    public void array_input()
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    public void find_greatest_smallest()
    {
        smallest = arr[0];
        greatest = arr[0];
        for(int i=0;i<n;i++)
        {
            if(smallest>arr[i])
            {
                smallest = arr[i];
            }
            if(greatest<arr[i])
            {
                greatest = arr[i];
            }
        }
    }

    public void display_difference()
    {
        System.out.println("The difference between the greatest & the smallest number in the array is : "+ (greatest-smallest));
    }


}
public class difference_between_greatest_smallest_no
{
    public static void main(String[] args)
    {
        difference ob1 = new difference();
        ob1.arrays_size_input();
        ob1.array_input();
        ob1.find_greatest_smallest();
        ob1.display_difference();
    }
}
