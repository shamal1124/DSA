import java.util.*;

public class rev_each_wod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();

        String arr[] = str.split("\\s+");

        for(int i = 0 ; i<arr.length ; i++){
            StringBuilder str1 = new StringBuilder(arr[i]);
            str1.reverse();
            arr[i] = str1.toString();
        }

        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
