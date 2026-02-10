/*
Question: Count Connected Components in an Undirected Graph

Given number of vertices V and edges, count how many connected
components are present in the graph using DFS.

Example:
V = 5
Edges:
0-1, 1-2, 3-4

Output: 2
Explanation:
Component 1 -> {0,1,2}
Component 2 -> {3,4}
*/

import java.util.*;

public class ConnectedComponentsDFS {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 4);

        System.out.println("Connected Components: " + countComponents(V, adj));
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static int countComponents(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited);
                count++;
            }
        }

        return count;
    }

    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }
}
