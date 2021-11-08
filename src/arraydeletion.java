import java.util.Arrays;
import java.util.Scanner;

class delarr {

    public static int[] removeTheElement(int[] arr, int index)
    {

        if (arr == null || index < 0 || index >= arr.length)
        {
            return arr;
        }

        int[] anotherArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++)
        {
            if (i == index)     {continue;}
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    // Driver Code

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");

        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }


        System.out.println("Initial Array: " + Arrays.toString(arr));
        System.out.println("Enter index to delete it's element : ");
        int index = sc.nextInt();
        //System.out.println("Index to be removed: " + index);
        // Remove the element
        arr = removeTheElement(arr, index);
        // Print the resultant array
        System.out.println("Final Array: " + Arrays.toString(arr));

    }
}
