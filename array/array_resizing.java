import java.util.*;

public class array_resizing {
    public static void main(String args[])
    {
        System.out.println("Ways to resize array : ");
        int arr[] = new int[5];

        int arr1[] = new int[1];
        arr1 = Arrays.copyOf(arr,2);
        System.out.println("array length using array.copy of : "+arr1.length);
        //it overide length 

        //arr1 = System.arraycopy(arr, 0, arr1, 0, 0);
        //System.out.println("array length using System.arraycopy : "+arr1.length);

        arr1 = new int[10];
        System.out.println("array length using normal method : "+arr1.length);

    }
}
