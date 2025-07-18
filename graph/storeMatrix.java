//this example is for undirected graph .. if it is directed graph then u need to just remove vice versaadded edge

class storeMatrix{
    public static void main(String[] args) {
        int n = 3 , m = 3;
        int[][] arr = new int[n+1][n+1];

        //edge 1-2
        arr[1][2] = 1;
        arr[2][1] = 1;

        //edge 2-3
        arr[2][3] = 1;
        arr[3][2] = 1;

        //edge 3-1
        arr[3][1] = 1;
        arr[1][3] = 1;

        // arr[u][v] = 1;
        // arr[v][u] = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("arr["+i+"]["+j+"] : "+ arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}