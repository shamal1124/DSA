import java.util.*;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();

        int flag = 0;
        for(int i = 0 , j = str.length()-1 ; i<=j ; i++,j--){
            if(str.charAt(i) != str.charAt(j)) flag =1;
        }

        System.out.println(flag == 0 ? "String is palindrome" : "String is not palindrome");

    }
}