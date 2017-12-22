package GraphAlgorithms;

import java.util.LinkedList;

public class Graph {
    private int v;//no of vertices
    private LinkedList[] adj;//adjacency Lists
    
    Graph(int v){
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList();
        }
    }
    
    public int getVertices(){
        return  v;
    }
    
    public LinkedList[] getAdj() {
        return adj;
    }
    
    
    
    public void addEdge(int from_vertex, int to_vertex){
        adj[from_vertex].add(to_vertex);
    }
}
