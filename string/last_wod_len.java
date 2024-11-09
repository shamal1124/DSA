import java.util.*;

public class last_wod_len{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();

        String[] arr = str.split("\\s+");
        System.out.println(" "+(arr[arr.length-1]).length());
    }
}