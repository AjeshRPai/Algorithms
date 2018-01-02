package GraphAlgorithms;

/**
 * @author ajeshpai
 * @link https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
**/


public class DetectCycle {
    
    static void isCyclic(int vertex,Graph graph,boolean[] isVisited){
    
        isVisited[vertex]=true;
    
        System.out.print(vertex+" ");
    
        for (Integer n : (Iterable<Integer>) graph.getAdj()[vertex]) {
            if (!isVisited[n]) {
                isCyclic(n,graph,isVisited);
            }else{
                System.out.println("The graph is acyclic at "+vertex);
                break;
            }
        }
    
    }
    
    public static void main(String[] args) {
        Graph graph = new Graph(4); //Graph with 4 edges
    
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
    
        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");
    
        boolean[] visited=new boolean[graph.getVertices()];
    
        isCyclic(0,graph,visited);
    }
}
