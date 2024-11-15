
import java.util.*;

public class stack_col{
    public static void main(String args[]){
        // Create a Stack
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int a = 0 ;

        while(a==0)
        {
            System.out.println("Enter choice : ");
            System.out.println("1:Push\t2:pop\t3:peek\t4:display\t5:exit");
            int ip = sc.nextInt();

            switch(ip)
            {
                case 1:
                        System.out.println("enter element :");
                        int ele = sc.nextInt();
                        stack.push(ele);
                        System.out.println("Stack after pushing: " + stack);
                    break;

                case 2 :
                        stack.pop();
                        System.out.println("Stack after pushing: " + stack);
                    break;

                case 3:
                        System.out.println("Top element (peek): " + stack.peek());
                        break;

                case 4:
                        System.out.println("stack : "+stack);
                        break;

                case 5:
                    a = 1;
            }
        }
    }
}