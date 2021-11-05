import java.util.Scanner;

class sort
{   int n;
    int arr[];

    public int[] array_input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        n = sc.nextInt();
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        return arr;
    }


    public int[] sorting()
    {   int a;
        for(int i=0;i<n;++i)
        {
            for(int j=i+1;j<n;++j)
            {
                if(arr[i]>arr[j])
                {
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        return arr;
    }

    public void display()
    {
        System.out.println("The sorted array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class SortingArray
{
    public static void main(String[] args) {

        sort ob1=new sort();
        ob1.array_input();
        ob1.sorting();
        ob1.display();
    }
}
