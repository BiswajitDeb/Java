import java.util.*;

public class stack_push_pop
{
    public static void main(String args[])
    {
        int choice;
        Stack<String> STACK = new Stack<String>();

        Scanner sc = new Scanner(System.in);

        int i=0;
        while(i==0)
        {
            System.out.println("Enter choice : ");
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Break\n\t:");
            choice= sc.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter element : ");
                    STACK.push(sc.next());
                    break;

                case 2 :
                    System.out.println("The popped element is : "+ STACK.pop());
                    break;

                case 3 :
                    System.out.println("The stack is : "+STACK);
                    break;
            }
        }
    }
}
