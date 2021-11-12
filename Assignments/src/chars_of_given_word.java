import java.util.*;
class Main
{
    static void string_present(String s1, String search)
    {
        int c = 0;
        char ch = ' ';
        int a[] = new int[Character.MAX_VALUE + 1];
        int l1=s1.length();
        int l2=search.length();
        for (int i = 0; i < l1; i++)
        {
            ch = s1.charAt(i);
            ++a[ch];
        }
        for (int i = 0; i < l2; i++)
        {
            ch = search.charAt(i);
            if (a[ch] >= 1)
                c = 1;
        }
        if (c == 1)
            System.out.println(s1);
    }

    public static void main(String args[])
    {
        String s1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of strings : ");
        int n=sc.nextInt();
        List < String > l = new ArrayList < String > ();
        System.out.println("Enter the strings below : ");
        for(int i=0;i<=n;i++)
        {
            s1=sc.nextLine();
            l.add(s1);
        }
        System.out.print("The given strings are: ");
        for (int i = 0; i < l.size(); i++)
        {
            System.out.print(l.get(i) + "   ");
        }

        System.out.print("\nEnter a word : ");
        String s2=sc.nextLine();
        System.out.print("\nThe strings containing all the letters of the given word is/are : ");
        for (int j = 0; j < l.size(); j++)
        {
            string_present(l.get(j), s2);
        }
    }
}