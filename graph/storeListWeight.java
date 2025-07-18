//this example is for undirected graph .. if it is directed graph then u need to just remove vice versaadded edge

import java.util.ArrayList;

class Pair{
    int dt ;
    int wt;

    Pair(int dt , int wt){
        this.dt = dt;
        this.wt = wt;
    }
}

public class storeListWeight {
    public static void main(String[] args) {
        int n = 3 ,m=3;
        ArrayList<ArrayList<Pair>> arr = new ArrayList<ArrayList<Pair>>();

        // n+1 loop to add array list inside 

        for(int i = 0 ; i <= n ; i++)
        {
            arr.add(new ArrayList<Pair>());
        }

        // edge 1-2 and weight is 5
        arr.get(1).add(new Pair(2, 5));
        arr.get(2).add(new Pair(1, 5));

        //edge 2-3 and weight is 1
        arr.get(2).add(new Pair(3, 1));
        arr.get(3).add(new Pair(2, 1));

        //edge u-v
        // arr.get(u).add(new pair(v,wt));
        // arr.get(v).add(new pair(u,wt));

        //print edges 
        for(int i = 1 ;i <=n ; i++)
        {
            for(Pair p : arr.get(i))
            {
                System.out.print("arr["+i+"]["+p.dt+"] : "+ p.wt + " ");
            }
            System.out.println("null");
        }
    }

}
