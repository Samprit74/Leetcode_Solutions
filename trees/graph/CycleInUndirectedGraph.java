/*
Question: Detect Cycle in an Undirected Graph

Given an undirected graph with V vertices and adjacency list,
detect whether the graph contains a cycle.

Example:
V = 5
Edges:
0-1, 1-2, 2-3, 3-4, 4-1

Output: Cycle detected
*/

import java.util.*;

public class DetectCycleGraph {

    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // edges
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 1);

        boolean hasCycle = isCycle(V, adj);

        if (hasCycle)
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle");
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfs(i, adj, visited))
                    return true;
            }
        }

        return false;
    }

    public static boolean bfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        Queue<Pair> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(new Pair(start, -1));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();

            for (int neighbor : adj.get(current.node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(new Pair(neighbor, current.node));
                } else if (neighbor != current.parent) {
                    return true;
                }
            }
        }

        return false;
    }
}
