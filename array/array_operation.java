import java.util.Scanner;

public class array_operation 
{

    //display method to print all elements
    public static void Display(int arr[],int siz)
    {
        if(siz==0)
        {
            System.out.println("\narray is empty");
        }
        else
        {
            System.out.println("array elements : \n");
            for(int i = 0 ; i<siz ; i++)
            {
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.println("\n");
    }

    //method to insert element
    public static void Insert(int arr[],int itm,int siz)
    {
        if(siz == arr.length)
        {
            System.out.println("array is full");
        }
        else
        {
            arr[siz-1] = itm;
            System.out.println("Array after insertion : ");
            Display(arr,siz);
            System.out.println("\n");
        }
    }

    //method to delete elment by index
    public static void Delete(int arr[],int idx,int siz)
    {
        if(siz==0)
        {
            System.out.println("Array is empty");
        }
        else
        {
            for(int i = 0 ; i<arr.length ; i++)
            {
                if(i>=idx-1)
                {
                    if(i==arr.length-1)
                    {
                        arr[i] = 0;
                    }
                    else
                    {
                        arr[i] = arr[i+1];
                    }  
                }
            }
            System.out.println("array after deletion");
            Display(arr, siz);
        }
    }


    //main method 
    public static void main(String args[])
    {
        System.out.println("\nprogram for array operations: \n");

        int arr[] = new int[10];
        int siz = 0;
        int a = 1;
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        while(a!=0)
        {
            System.out.println("1:dispaly\t 2:insert\t 3:delete\t 4:resize array\t 5:exit");
            System.out.println("Enter choice :");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1 :
                    Display(arr,siz);
                    break;
                case 2 :
                    System.out.println("\nEnter element :");
                    int itm = sc.nextInt();
                    siz = siz+1;
                    Insert(arr,itm,siz);
                    break;
                case 3 :
                    System.out.println("\nEnter Index : ");
                    int idx = sc.nextInt();
                    siz = siz-1;
                    Delete(arr,idx,siz);
                    break;

                case 4 :
                    System.out.println("additional size : ");
                    int adsiz = sc.nextInt();
                    arr = new int[arr.length+adsiz];
                    System.out.println("new array size : "+arr.length+"\n");
                    break;

                case 5 :
                    a = 0;
            }
        }
    }
}