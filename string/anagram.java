import java.util.*;

public class anagram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 string : ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int flag = 0;

        if(arr1.length == arr2.length){
            for(int i =0 ; i < arr1.length ; i++){
                if(arr1[i]!=arr2[i])
                {
                    flag = 1 ;
                    break;
                }
            }
        }

        System.out.println((flag==1 || (arr1.length != arr2.length)) ? "Not an anagram" : "it as an anagram");

    }
}