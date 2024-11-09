import java.util.*;

public class vowel_cons{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();

        int vow = 0;

        for(int i = 0 ;i<str.length() ; i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vow++;
            }
        }

        System.out.println("vowels are : "+vow+"\nConsonants are : "+(str.length()-vow));
    }
}