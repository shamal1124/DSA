import java.util.ArrayList;

public class dfs {
    public static void main(String[] args) {
        System.out.println("BFS implementation example");
        // v is number of nodes 
        int v = 8;
        
        // create an adjacency list for the graph
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
for (int i = 0; i <= v; i++) {
    adj.add(new ArrayList<>());
}


        // Add edges (example graph)
        adj.get(1).add(2);
        adj.get(1).add(6);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(4).add(5);
        adj.get(6).add(7);
        adj.get(6).add(8);
        adj.get(7).add(5);

        ArrayList<Integer> result = dfs(v, adj);
        System.out.println("DFS Traversal: " + result);
    }

    public static ArrayList<Integer> dfs(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> dfs = new ArrayList<>(); // to store the DFS traversal
        
        boolean[] visited = new boolean[v + 1]; // to track visited nodes
        
        // Start DFS from node 1
        int startNode = 1;

        dfsUtil(startNode, adj, visited, dfs); // start DFS from node 1
        
        return dfs; // return the DFS traversal result
    }

    public static void dfsUtil(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> dfs) {
        visited[node] = true; // mark the node as visited
        dfs.add(node); // add the node to the DFS result
        for (int n : adj.get(node)) {
            if (!visited[n]) {
                dfsUtil(n, adj, visited, dfs); // recursively visit unvisited neighbors
            }
        }
    }
}
