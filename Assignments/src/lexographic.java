import java.util.Scanner;

class loxographicrank
{
    static int fact(int n)
    {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }

    static void count_update(int[] count, char[] str)
    {
        int i;

        for (i = 0; i < str.length; ++i)
            ++count[str[i]];

        for (i = 1; i < 200; ++i)
            count[i] += count[i - 1];
    }

    static void updatecount(int[] count, char ch)
    {
        int i;
        for (i = ch; i < 200; ++i)
            --count[i];
    }

    static int findRank(char[] str)
    {
        int len = str.length;
        int mul = fact(len);
        int rank = 1, i;

        int count[] = new int[200];
        count_update(count, str);

        for (i = 0; i < len; ++i) {
            mul /= len - i;
            rank += count[str[i] - 1] * mul;
            updatecount(count, str[i]);
        }
        return rank;
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        char str[] = sc.nextLine().toCharArray();
        System.out.println("Lexographic rank for is "+findRank(str));
    }
}

