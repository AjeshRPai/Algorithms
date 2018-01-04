package GraphAlgorithms;

import java.util.Iterator;
import java.util.Stack;

public class TopologicalSort {
    
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
    
        System.out.println("Following is a Topological " +
                "sort of the given graph");
        sortTopologically(graph);
    }
    
    static void sortTopologically(Graph graph){
        
        //This will be used to keep the Vertices
        Stack stack=new Stack();
        
        boolean visited[]=new boolean[graph.getVertices()];
        
        //Mark all the vertices as not visited
        for(int i=0;i<graph.getVertices();i++)
            visited[i]=false;
        
        //Calling for the Adjacent vertices of a vertex
        for(int i=0;i<graph.getVertices();i++) {
            System.out.println("The vertex is "+i);
            if (!visited[i]) {
                topologicalSortUtil(graph, i, stack, visited);
            }else {
                System.out.print(+i+" has been visited so skipping it");
            }
        }
        
        while (!stack.isEmpty())
            System.out.println(stack.pop()+" ");
        
    
    }
    
    static void topologicalSortUtil(Graph graph, int vertex, Stack stack, boolean[] visited){
        System.out.println("Recursively looking at the Adjacent Vertex of "+vertex);
         
        visited[vertex]=true;
    
        Integer i;
    
        // Recur for all the vertices adjacent to this
        // vertex
        for (Integer integer : (Iterable<Integer>) graph.getAdj()[vertex]) {
            i = integer;
            System.out.println("The vertex is "+i);
            if (!visited[i]) {
                System.out.println("The vertex that hasnt visited is " + i);
                topologicalSortUtil(graph, i, stack, visited);
            }
        }
    
        // Push current vertex to stack which stores result
        System.out.println("Pushing the vertex =" +vertex+" since we have visited all its neighbours");
        stack.push(vertex);
        
    }
    
}
