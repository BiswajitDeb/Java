import java.util.Scanner;

class triangle
{
    Scanner sc = new Scanner(System.in);
    int arr[]=new int[100];
    int n;

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

    public int possible_triangle_count()
    {
        int count =0;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                for (int k = j + 1; k < n; k++)
                {
                    if (arr[i] + arr[j] > arr[k] && arr[i] + arr[k] > arr[j] && arr[k] + arr[j] > arr[i])
                        count++;
                }
            }
        }
        return count;
    }

}

public class possible_triangle
{
    public static void main(String[] args)
    {
        triangle ob1 = new triangle();
        ob1.input();
        System.out.println("The possible triangles that can be formed with the elements of the array is : "+ ob1.possible_triangle_count());
    }
}
