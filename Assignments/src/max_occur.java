import java.util.Scanner;

class Ma_occur
{
    static char maxoccur(String str)
    {
        int count[] = new int[200];
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) 
        {
            if (max < count[str.charAt(i)]) 
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Max occurring character is " + maxoccur(str));
    }
}
