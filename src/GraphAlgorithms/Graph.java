package GraphAlgorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private int v;//no of vertices
    private LinkedList<Integer>[] adj;//adjacency Lists
    
    Graph(int v){
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }
    
    public int getVertices(){
        return  v;
    }
    
    public LinkedList<Integer>[] getAdj() {
        return adj;
    }
    
    public void addEdge(int from_vertex, int to_vertex){
        adj[from_vertex].add(to_vertex);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertices  =" + v +
                ", adj=" + Arrays.toString(adj) +
                '}';
    }

    public void printGraph(){
        int vertex = getVertices();
        List<Integer>[] list = getAdj();

        for (int i = 0; i <vertex ; i++) {
            if(list[i].size()>0) {
                for (int j = 0; j < list[i].size();  j++) {
                    System.out.println(i+"------"+list[i].get(j) + " ");
                }
            }
        }
    }
}
