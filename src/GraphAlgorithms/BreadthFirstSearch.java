package GraphAlgorithms;

import java.util.Iterator;
import java.util.LinkedList;


public class BreadthFirstSearch {
    
    static void BFS(int s,Graph graph) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[graph.getVertices()];
        
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
        
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for (Integer n : (Iterable<Integer>) graph.getAdj()[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    
    public static void main(String args[]) {
        Graph g = new Graph(4); //Graph with 4 edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
        BFS(2,g);
    }
}

