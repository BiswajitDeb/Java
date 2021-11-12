import java.util.Scanner;

class string_div
{
    static void divideString(String str, int n)
    {
        int str_size = str.length();
        int part_size;

        if (str_size % n != 0)
        {
            System.out.println("The string "+ str + " can't be divided in "+n+" equal parts");
            return;
        }
        part_size = str_size / n;
        for (int i = 0; i < str_size; i++) {
            if (i % part_size == 0)
                System.out.println();
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Enter the number of equal parts you want to divide the string into : ");
        divideString(str,sc.nextInt());
    }
}
