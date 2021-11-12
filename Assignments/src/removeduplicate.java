import java.util.Scanner;
import java.util.Arrays;

class RemoveDuplicate
{
    static String remDup(char str[], int n)
    {

        int index = 0;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])   {break;}
            }

            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        char str[] = sc.nextLine().toCharArray();
        int n = str.length;
        System.out.println(remDup(str, n));
    }
}

