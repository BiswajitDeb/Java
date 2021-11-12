import java.util.*;
public class string_duplicate_deletion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the 2nd string : ");
        String str2 = sc.nextLine();
        /*System.out.println("The given string is: " + str1);
        System.out.println("The given mask string is: " + str2);*/
        char arr[] = new char[str1.length()];
        char[] mask = new char[256];
        for (int i = 0; i < str2.length(); i++)
            mask[str2.charAt(i)]++;
        System.out.print("\nThe new string is : ");
        for (int i = 0; i < str1.length(); i++) {
            if (mask[str1.charAt(i)] == 0)
                System.out.print(str1.charAt(i));
        }
    }
}
