import java.util.*;

public class array_copy{
    public static void main(String args[])
    {
        System.out.println("\nDifferent ways to copy array : ");

        int arr[] = new int[]{1,2,30,3};

        System.out.println("\n1: using direct assignment method : ");
        int arr1[] = new int[10];
        arr1 = arr;
        System.out.println("elements in array 2"+Arrays.toString(arr1));//display without sorting
        arr1[0] = 50;
        System.out.println("elements after changing value \narray 1 :"+Arrays.toString(arr)+"\narray 2 :"+Arrays.toString(arr1));
        //changes value vice versa 

        System.out.println("\n2: using System.arrayCopy ");
        int arr2[] = new int[10];
        arr2[0] = 10;
        arr2[1] = 20;
        System.arraycopy(arr, 1, arr2, 2, 2);
        //arr is array whoes elements are going to be copied 1 is from where we copy element 
        // arr3 is where to copy 2 is the index from where we are going to copy elements 2 is length of 
        //copied elements
        System.out.println("result : "+Arrays.toString(arr2));

        System.out.println("\n3: using arrays.copy of");
        int arr3[] = new int[10];
        arr3 = Arrays.copyOf(arr,3);//3 is no. of element we copy from array
        System.out.println("Result : "+Arrays.toString(arr3));

        System.out.println("4: using loop ");
        int arr4[] = new int[arr.length];
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr4[i] = arr[i];
        }

        System.out.println("Result"+Arrays.toString(arr4));
    }
}