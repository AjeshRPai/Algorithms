package GraphAlgorithms;

public class DepthFirstSearch {
    
    static void DFSUtil(int vertex,boolean visited[],Graph graph){
        
        visited[vertex]=true;
    
        System.out.print(vertex+" ");
        
        for (Integer n : (Iterable<Integer>) graph.getAdj()[vertex]) {
            if (!visited[n]) {
                DFSUtil(n,visited,graph);
            }
        }
    }
    
    static void DFS(int vertex,Graph graph){
        boolean[] visited=new boolean[graph.getVertices()];
        DFSUtil(vertex,visited,graph);
    }
    
    public static void main(String[] args){
        Graph g = new Graph(4); //Graph with 4 edges
    
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
    
        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");
    
        DFS(2,g);
    }
}
