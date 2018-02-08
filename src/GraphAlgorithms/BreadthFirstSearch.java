package GraphAlgorithms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import static java.lang.System.out;
import java.util.Scanner;


public class BreadthFirstSearch {
    
    
    static int[] bfs(int n, int m, int[][] edges, int s) {
        // Complete this function
        boolean visited[] = new boolean[n];
        int[] distance= new int[n+1];
        Arrays.fill(distance,-1);
        for(int i=0;i<m;i++){
            out.println("edges are starting="+edges[i][0]+" ending="+edges[i][1]);
            if(s==edges[i][0])
                distance[edges[i][1]]=6;
            else
                distance[edges[i][1]]=(distance[edges[i][0]]+6);
        }
        return printformat(distance,s);
    }
    
    
    static int[] printformat(int[] distances,int source){
        int[] result_format= new int[distances.length-2];
        int res_pointer=0;
        for(int i=1;i<distances.length;i++){
            System.out.println("res_pointer "+res_pointer+" distance ="+distances[i]+" i="+i);
            if(i!=source){
                result_format[res_pointer]=distances[i];
                res_pointer++;
            }
        }
        return result_format;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] edges = new int[m][2];
            for(int edges_i = 0; edges_i < m; edges_i++){
                for(int edges_j = 0; edges_j < 2; edges_j++){
                    edges[edges_i][edges_j] = in.nextInt();
                }
            }
            int s = in.nextInt();
            int[] result = bfs(n, m, edges, s);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");
        }
        in.close();
    }
    
   
}

