import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
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

        ArrayList<Integer> result = bfs(v, adj);
        System.out.println("BFS Traversal: " + result);
    }

    public static ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> bfs = new ArrayList<>(); // to store the BFS traversal
        
        boolean[] visited = new boolean[v + 1]; // to track visited nodes
        
        Queue<Integer> queue = new LinkedList<>(); // queue for BFS
        
        queue.add(1); // start BFS from node 1
        visited[1] = true; // mark node 1 as visited

        while(!queue.isEmpty()) {
            int node = queue.poll(); // get the front node from the queue
            bfs.add(node); // add the node to the BFS result
            for(int n : adj.get(node))
            {
                if(!visited[n])
                {
                    visited[n] = true; // mark the node as visited
                    queue.add(n); // add the node to the queue for further exploration
                }
            }
        }
        return bfs; // return the BFS traversal result
    }
}
