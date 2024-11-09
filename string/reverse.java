import java.util.*;

public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();

        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        System.out.println(str1);


        //or this way 
        
        // String str1 = "";
        // for(int i =str.length()-1 ; i>=0 ;i--)
        // {
        //     str1 = str1+str.charAt(i);
        // }
        // System.out.println("revese string : "+str1);
    }
}
