//this example is for undirected graph .. if it is directed graph then u need to just remove vice versaadded edge
class storeMatrixWeight{
    public static void main(String[] args) {
       int n = 3 , m = 3;
        int[][] arr = new int[n+1][n+1];

        //edge 1-2 and weight is 5
        arr[1][2] = 5;
        arr[2][1] = 5;

        //edge 2-3 and weight is 10
        arr[2][3] = 10;
        arr[3][2] = 10;

        //edge 3-1 and weight is 1
        arr[3][1] = 1;
        arr[1][3] = 1;

        // arr[u][v] = weight;
        // arr[v][u] = weight;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("arr["+i+"]["+j+"] : "+ arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}