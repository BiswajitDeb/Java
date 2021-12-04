//Name : Biswajit Deb
//Enrollment id : 2011200001018

import java.util.Arrays;

class solution
{
    public static void merge_sorted_arrays(int[] A, int p, int[] B, int q)
    {

        for (int i = 0; i < p; i++)
        {
            if (A[i] > B[0])
            {
                int temp = A[i];
                A[i] = B[0];
                B[0] = temp;

                int first_arr = B[0];
                int k;
                for (k = 1; k < q && B[k] < first_arr; k++)
                {
                    B[k - 1] = B[k];
                }

                B[k - 1] = first_arr;
            }
        }
    }

    public static void main (String[] args)
    {
        int[] A = { 1, 2, 4, 5, 6, 7};
        int[] B = { 8, 9, 10 };

        System.out.println("The Given Arrays are :");
        System.out.println("Array 1 : " + Arrays.toString(A));
        System.out.println("Array 2 : " + Arrays.toString(B));

        merge_sorted_arrays(A, A.length, B, B.length);

        System.out.println("\nThe Sorted Arrays:");
        System.out.println("Array 1 : " + Arrays.toString(A));
        System.out.println("Array 2 : " + Arrays.toString(B));
    }
}