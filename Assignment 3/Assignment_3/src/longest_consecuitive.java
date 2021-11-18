import java.io.*;
import java.util.*;

class Longest_sequence
{

    static int longest_chain(int arr[], int n)
    {
        Arrays.sort(arr);
        int ans = 0, count = 0;
        ArrayList<Integer> v = new ArrayList<Integer>();
        v.add(10);

        for (int i = 1; i < n; i++)
        {
            if (arr[i] != arr[i - 1])
                v.add(arr[i]);
        }

        for (int i = 0; i < v.size(); i++)
        {
            if (i > 0 &&v.get(i) == v.get(i - 1) + 1)
                count++;
            else
                count = 1;

            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.print("Enter array length : ");
        int arr_length = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=0;i<arr_length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n = arr.length;

        System.out.println("Length of the longest subsequence is : " + longest_chain(arr, n));
    }
}

