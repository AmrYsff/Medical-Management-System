package project;

import java.util.*;

class Graph {
    private final int[][] adjacencyMatrix;
    final String[] nodes;
    int exits[] = {7, 8 , 9 , 10 } ;

    public Graph(int size) {
        this.adjacencyMatrix = new int[size][size];
        this.nodes = new String[size];
    }

    public void addNode(int index, String name) {
        nodes[index] = name;
    }

    public void addEdge(int from, int to, int weight) {
        adjacencyMatrix[from][to] = weight;
        adjacencyMatrix[to][from] = weight; // Assuming undirected graph
    }
    

    public void findClosestExit(int start) {
        int size = adjacencyMatrix.length;
        int[] distances = new int[size];
        boolean[] visited = new boolean[size];
        int[] previous = new int[size];

        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(previous, -1);
        distances[start] = 0;

        for (int i = 0; i < size; i++) {
            int u = getClosestNode(distances, visited);
            if (u == -1) break; // All reachable nodes are visited
            visited[u] = true;

            for (int v = 0; v < size; v++) {
                if (adjacencyMatrix[u][v] > 0 && !visited[v]) {
                    int newDist = distances[u] + adjacencyMatrix[u][v];
                    if (newDist < distances[v]) {
                        distances[v] = newDist;
                        previous[v] = u;
                    }
                }
            }
        }

        int closestExit = -1;
        int minDistance = Integer.MAX_VALUE;
        for (int exit : exits) {
            if (distances[exit] < minDistance) {
                minDistance = distances[exit];
                closestExit = exit;
            }
        }

        System.out.print("Closest exit to " + nodes[start] + " is " + nodes[closestExit] + " with a distance of " + minDistance + ". Path: ");
        printPath(closestExit, previous);
        System.out.println();
    }

    private int getClosestNode(int[] distances, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int closestNode = -1;

        for (int i = 0; i < distances.length; i++) {
            if (!visited[i] && distances[i] < minDistance) {
                minDistance = distances[i];
                closestNode = i;
            }
        }

        return closestNode;
    }

    private void printPath(int node, int[] previous) {
        if (node == -1) return;
        printPath(previous[node], previous);
        System.out.print(nodes[node] + " ");
    }
    
}

