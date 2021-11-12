import java.util.Scanner;
class first_non_rep
{
    static char count[] = new char[200];
    
    static void GetArr(String str)
    {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }

    static int Non_Rep(String str)
    {
        GetArr(str);
        int index = -1;

        for (int i = 0; i < str.length(); i++)
        {
            if (count[str.charAt(i)] == 1)
            {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int index = Non_Rep(str);
        System.out.println("The 1st non repeating letter is : " + str.charAt(index));
    }
}
