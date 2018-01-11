package GraphAlgorithms;

import java.util.HashMap;
import java.util.LinkedList;

public class EuclerianCircuit {
    
    static class LetterGraph {
        private int v;//no of vertices
        private LinkedList[] adj;//adjacency Lists
        
        LetterGraph(int v,String[] letters){
            this.v=v;
            adj=new LinkedList[v];
            for(int i=0;i<v;i++){
                Character first_char=letters[i].charAt(0);
                Character last_char=letters[i].charAt(letters[i].length()-1);
                  adj[first_char]=new LinkedList();
                    adj[last_char]=new LinkedList();
            }
        }
        
        public int getVertices(){
            return  v;
        }
        
        public LinkedList[] getAdj() {
            return adj;
        }
        
        
        
        public void addEdge(char from_vertex, char to_vertex){
            adj[from_vertex].add(to_vertex);
        }
        
        
    }
    
    public static void main(String[] args) {
    
        String[] letters= {"abc", "efg", "cde", "ghi", "ija"};
        
    
        LetterGraph g = new LetterGraph(letters.length,letters); //Graph with 4 edges
        HashMap<Character,Boolean> map = new HashMap<>(letters.length);
        
        for(String s:letters){
            g.addEdge(s.charAt(0),s.charAt(s.length()-1));
            map.putIfAbsent(s.charAt(0),false);
            map.putIfAbsent(s.charAt(s.length()-1),false);
        }
    
        isCircleofStrings(g,map,letters[0].charAt(0));
    }
    
    private static void isCircleofStrings(LetterGraph graph,HashMap<Character,Boolean> map,Character character) {
        DFSUtil(graph,character,map);
        
    }
    
    private static void DFSUtil(LetterGraph graph,Character vertex,HashMap<Character,Boolean> map){
          map.put(vertex,true);
          
          for(Character character:(Iterable<Character>)graph.adj[vertex].iterator()){
              System.out.println(" "+character);
          }
    }
    
    
    private static void SCC(Graph graph,HashMap<Character,Boolean> map){
    
    }
    
}
