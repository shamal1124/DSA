//this example is for undirected graph .. if it is directed graph then u need to just remove vice versaadded edge

import java.util.ArrayList;

public class storeList {
    public static void main(String[] args) {
        int n = 3 ,m=3;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        // n+1 loop to add array list inside 

        for(int i = 0 ; i <= n ; i++)
        {
            arr.add(new ArrayList<Integer>());
        }

        // edge 1-2
        arr.get(1).add(2);
        arr.get(2).add(1);

        //edge 2-3 
        arr.get(2).add(3);
        arr.get(3).add(2);

        //edge u-v
        // arr.get(u).add(v);
        // arr.get(v).add(u);

        //print edges 
        for(int i = 1 ;i <=n ; i++)
        {
            for(int j = 0 ; j < arr.get(i).size() ;j++)
            {
                System.out.print("arr["+i+"]["+j+"] : "+ arr.get(i).get(j) + " ");
            }
            System.out.println("null");
        }
    }
}
