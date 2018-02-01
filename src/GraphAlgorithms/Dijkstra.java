package GraphAlgorithms;

import java.util.Arrays;

public class Dijkstra {
    static final int V=4;
    
    public static void main(String[] args) {
        int graph[][] = new int[][]{{0, 4, 0, 4},
                {4, 0, 8, 0},
                {0, 8, 0, 7},
                {4, 0, 7, 0}
        };
        dijkstra(graph, 0);
    }
    
    static int minDistance(int dist[], Boolean sptSet[]) {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
        
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        
        return min_index;
    }
    
    private static void dijkstra(int graph[][], int src) {
        int dist[] = new int[V]; // The output array. dist[i] will hold
        // the shortest distance from src to i
        
        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];
    
        Arrays.fill(dist,Integer.MAX_VALUE);
        Arrays.fill(sptSet,false);
        
        // Distance of source vertex from itself is always 0
        dist[src] = 0;
        
        // Find shortest path for all vertices
        //IF there are 4 vertices then array size is 3 X 3
        for (int count = 0; count < V-1; count++) {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet);
            
            System.out.println("Min distance "+u);
            
            // Mark the picked vertex as processed
            sptSet[u] = true;
            
            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++) {
    
                System.out.println("the vertexes are  "+u +" and "+ + v);
    
                if (!sptSet[v] //this point is already visited
                        && graph[u][v] != 0 //cant be reached
                        && dist[u] != Integer.MAX_VALUE //if this node cant be reached from any point
                        && dist[u] + graph[u][v] < dist[v])//the distance is more than the previous value
                {
                    dist[v] = dist[u] + graph[u][v];
                    System.out.println(" distance is "+dist[v]);
    
                }
    
            }
        }
        
        // print the constructed distance array
        printSolution(dist, V);
    }
    
    static void printSolution(int dist[], int n) {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" t "+dist[i]);
    }
    
    
}
