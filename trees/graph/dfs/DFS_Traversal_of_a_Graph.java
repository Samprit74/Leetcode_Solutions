/*
Question: DFS Traversal of a Graph

Given a graph with V vertices and adjacency list,
return the DFS traversal starting from node 0.

Example:
V = 5
Edges:
0-1, 0-2, 1-3, 2-4

Output: 0 1 3 2 4
*/

import java.util.*;

public class DFSTraversal {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);

        ArrayList<Integer> result = dfsTraversal(V, adj);
        System.out.println("DFS Traversal: " + result);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static ArrayList<Integer> dfsTraversal(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();

        dfs(0, adj, visited, result);
        return result;
    }

    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj,
                           boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, result);
            }
        }
    }
}
