import java.util.Scanner;

class tensor
{
    Scanner sc = new Scanner(System.in);
    int column1,column2,row1,row2;
    int first_matrix[][]= new int[10][10];
    int second_matrix[][]= new int[10][10];
    int sum=0;

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

    int[][] product_matrix= new int[10][10];

    public void product()
    {
        for (int i = 0; i < row1; i++)
        {
            for (int j = 0; j < column2; j++)
            {
                for (int k = 0; k < row2; k++)
                {
                    sum += first_matrix[i][k] * second_matrix[k][j];
                }
                product_matrix[i][j] = sum;
                sum = 0;
            }
        }
    }


    public void display()
    {
        System.out.println("Product of the matrices:");

        for (int i = 0; i < row1; i++)
        {
            for (int j = 0; j < column2; j++)
                System.out.print(product_matrix[i][j]+"\t");

            System.out.print("\n");
        }
    }


}


public class tensor_product_matrix
{
    public static void main(String[] args)
    {
        tensor ob1 = new tensor();
        ob1.matrix_input();
        ob1.product();
        ob1.display();
    }
}
