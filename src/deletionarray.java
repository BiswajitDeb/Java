import java.util.Scanner;
import java.util.Arrays;

class delete
{
    Scanner sc=new Scanner(System.in);
    int n;

    public void sizeinput()
    {
        System.out.print("Enter the size of the array : ");
        n= sc.nextInt();
    }

    int arr[]=new int[n];
    public int[] arrayinput()
    {
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public int[] deeteelement()
    {
        System.out.println("Enter position to delete : ");
        int j=sc.nextInt();
        while(j<n)
        {
            arr[j]=arr[j+1];
            j+=1;
            n-=1;
        }
        return arr;
    }

    public void displayarray()
    {
        for(int i=1;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}

public class deletionarray
{
    public static void main(String[] args)
    {
        delete ob1 =new delete();
        ob1.sizeinput();
        ob1.arrayinput();
        ob1.displayarray();
        ob1.deeteelement();
        ob1.displayarray();
    }
}
