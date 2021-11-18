import java.util.Scanner;
class Hypsters_walk
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number of steps");
        n=sc.nextInt();
        if(n==0)
        {
            System.out.println("walker is still in the same place");
            System.exit(0);
        }
        float arr [][]= new float[n][n];
        float p=1;
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==j || j==0)
                {
                    arr[i][j]=p;
                }
                else
                {
                    arr [i][j]= arr[i-1][j-1]/2+arr[i-1][j]/2;
                }
            }
            p=p/2;
        }
        System.out.println("the positional probability after the 'n' number of steps of drunker's walk :");
        for(int i=0;i<n;i++){
            System.out.print("for n ="+i+": probability is =");
            for(int j =0;j<=i;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
