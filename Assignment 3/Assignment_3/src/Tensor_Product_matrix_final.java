import java.util.Scanner;

class tensor_product
{
    Scanner sc = new Scanner(System.in);
    int column1,column2,row1,row2;
    int first_matrix[][]= new int[10][10];
    int second_matrix[][]= new int[10][10];

    //static int column1 = 2, row1 = 3, column2 = 3, row2 = 2;

    public void tensor_calculation()
    {

        int[][] C= new int[row1 * row2][column1 * column2];
        System.out.println("The tensor product matrix is : ");
        for (int i = 0; i < row1; i++)
        {
            
            for (int k = 0; k < row2; k++)
            {
                
                for (int j = 0; j < column1; j++)
                {
                    
                    for (int l = 0; l < column2; l++)
                    {

                        C[i + l + 1][j + k + 1] = first_matrix[i][j] * second_matrix[k][l];
                        System.out.print( C[i + l + 1][j + k + 1]+" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public void matrix_input()
    {
        System.out.print("Enter column for the 1st matrix : ");
        column1 = sc.nextInt();
        System.out.print("Enter row for the 1st matrix : ");
        row1 = sc.nextInt();

        System.out.println("Enter elements of the 1st matrix : ");
        for (int i = 0; i < row1; i++)
            for (int j = 0; j < column1; j++)
                first_matrix[i][j] = sc.nextInt();

        System.out.print("Enter column for the 2nd matrix : ");
        column2 = sc.nextInt();
        System.out.print("Enter row for the 2nd matrix : ");
        row2 = sc.nextInt();

        //check if column1 == row2 or not
        if(column1 != row2)
        {
            System.out.println("There can't be any tensor product");
        }
        else
        {
            System.out.println("Enter elements of the 2nd matrix : ");
            for (int i = 0; i < row2; i++)
                for (int j = 0; j < column2; j++)
                    second_matrix[i][j] = sc.nextInt();
        }
    }


    
}

public class Tensor_Product_matrix_final
{
    public static void main(String[] args) 
    {
        tensor_product ob1 = new tensor_product();
        ob1.matrix_input();
        ob1.tensor_calculation();
    }
}
