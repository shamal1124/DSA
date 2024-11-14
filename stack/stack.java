import java.util.*;

public class stack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int stk[] = new int[5];
        int top = 0;
        int a =0;
        while(a==0)
        {
            System.out.println("Enter choice : ");
            System.out.println("1:Push\t2:pop\t3:peek\t4:display\t5:exit");
            int ip = sc.nextInt();

            switch(ip)
            {
                case 1:
                    if(top==5)
                    {
                        System.out.println("Stack overflow");
                    }
                    else
                    {
                        System.out.println("enter element :");
                        int ele = sc.nextInt();
                        stk[top]= ele ;
                        top++;
                        System.out.println("element pushed");
                    }
                    break;

                case 2 :
                    if(top == 0)
                    {
                        System.out.println("Stsck underflow");
                    }
                    else
                    {
                        top--;
                        System.out.println("element poped");
                    }
                    break;

                case 3:
                    if(top == 0) System.out.println("stack underflow");
                    else System.out.println("peek value is : "+stk[top-1]);
                    break;

                case 4:
                    if(top == 0) System.out.println("stack is empty");
                    else{
                        System.out.print("stack elements :");
                        for(int i = 0 ; i<top ;i++)
                            System.out.print(stk[i]+"\t");
                        System.out.println();
                    }
                    break;

                case 5:
                    a = 1;
            }
        }
    }
}