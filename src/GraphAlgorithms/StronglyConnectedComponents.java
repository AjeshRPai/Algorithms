package GraphAlgorithms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class StronglyConnectedComponents {
    public static void main(String args[]) {
        // Create a graph given in the above diagram
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
    
        System.out.println("Following are strongly connected components " +
                "in given graph ");
        printSCCs(g);
    }
    
    private static void printSCCs(Graph graph){
        boolean[] visited=new boolean[graph.getVertices()];
    
        //Mark all vertices as not visited
        Arrays.fill(visited,false);
        
        Stack stack=new Stack();
        //This is kind of similar to DFS with difference being that after
        // Doing DFS the vertices are pushed to the Stack
        
        for(int i=0;i<graph.getVertices();i++){
            if(!visited[i])
                fillInOrder(graph,visited,i,stack);
        }
        
        Graph graph1=getTranspose(graph);
        
        Arrays.fill(visited,false);
        
        while (!stack.isEmpty()){
            int vertex=(int)stack.pop();
            System.out.println("The Stack item is "+vertex);
            if(!visited[vertex]) {
                DFSUtil(vertex, visited, graph1);
                System.out.println();
            }
        }
    }
    
    
    private static void fillInOrder(Graph graph, boolean[] visited, int vertex, Stack stack){
        
        visited[vertex]=true;
        
        for(Integer integer:(Iterable<Integer>)graph.getAdj()[vertex]){
            if(!visited[integer])
                fillInOrder(graph,visited,integer,stack);
        }
        
        System.out.println("The item pushed to stack is"+vertex);
        stack.push(vertex);
    }
    
    private static Graph getTranspose(Graph graph){
        Graph graphTranspose=new Graph(graph.getVertices());
    
        for (int i = 0; i < graph.getVertices(); i++)
        {
            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> integerIterator =graph.getAdj()[i].listIterator();
            while(integerIterator.hasNext())
                graphTranspose.getAdj()[integerIterator.next()].add(i);
        }
    
        return graphTranspose;
    }
    
    
    private static void DFSUtil(int vertex, boolean visited[], Graph graph){
        visited[vertex]=true;
        
        System.out.print(vertex+" ");
        
        for (Integer n : (Iterable<Integer>) graph.getAdj()[vertex]) {
            if (!visited[n]) {
                DFSUtil(n,visited,graph);
            }
        }
    }
    
}
