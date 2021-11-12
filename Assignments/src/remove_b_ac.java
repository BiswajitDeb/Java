import java.util.Scanner;
class remove_b_ac
{
    static void stringFilter(char str[])
    {
        int n = str.length;
        int i = -1;
        int j = 0;

        while (j < n)
        {
            if (j < n-1 && str[j] == 'a' && str[j+1] == 'c')
                j += 2;

            else if (str[j] == 'b')
                j++;

            else if (i >= 0 && str[j] == 'c' && str[i] == 'a')
            {
                i--;
                j++;
            }

            else
                str[++i] = str[j++];

        }
        System.out.println(new String(str).substring(0,i+1));
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringFilter(str.toCharArray());


    }
}
