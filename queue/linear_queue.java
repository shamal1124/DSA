import java.util.*;

public class linear_queue
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int max = 5;
        int arr[] = new int[max];
        int front = -1,rear=-1;
        int a =0;

        while(a==0)
        {
            System.out.println("Enter choice : ");
            System.out.println("1:enqueue\t2:dequeue\t3:peek\t4:display\t5:exit");
            int ip = sc.nextInt();

            switch(ip)
            {
                case 1:
                    System.out.println("enter element :");
                    int ele = sc.nextInt();
                    if(rear == max-1)
                    {
                        System.out.println("overflow\n");
                    }
                    else if(front == -1)
                    {
                        front = rear = 0;
                        arr[rear] = ele;
                        System.out.println("enqueue performed\n");
                    }
                    else
                    {
                        rear += 1;
                        arr[rear] = ele;
                        System.out.println("enqueue performed\n");
                    }
                    break;
                case 2:
                    if(front == -1)
                    {
                        System.out.println("underflow\n");
                    }
                    else if(front == rear)
                    {
                        front = rear = -1;
                        System.out.println("dequeue performed\n");
                    }
                    else
                    {
                        front++;
                        System.out.println("dequeue performed\n");
                    }
                    break;
                case 3:
                    if(front == -1)
                    {
                        System.out.println("underflow\n");
                    }
                    else
                    {
                        System.out.println("peek : "+arr[front]);
                    }
                    break;
                case 4:
                    if(front == -1)
                    {
                        System.out.println("underflow\n");
                    }
                    else
                    {
                        for(int i = front ; i <= rear ; i++)
                        {
                            System.out.print(arr[i]+"\t");
                        }
                        System.out.println();
                    }         
                    break;
                case 5:
                    a = 1;
                    break;
            }
        }
    }
}