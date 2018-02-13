package LinkedListAlgorithms;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;
import static LinkedListAlgorithms.LinkedList.*;

//Created by Ajesh on 13/02/18

public class RemoveLoop {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        LinkedList loop=createLoop(llist,2);
        detectLoop(loop);
        loop.printList();
    }
    
    private static LinkedList createLoop(LinkedList llist,int to_position) {
        LinkedList.Node current=llist.head;
        while (current.next!=null){
            current=current.next;
        }
        System.out.println("the last node is "+current.data);
        
        LinkedList.Node loop_Start=llist.head;
        int k=0;
        while (k<to_position){
            loop_Start=loop_Start.next;
            k++;
        }
        System.out.println("The node at which the loop is to be pointed "+loop_Start.data);
        current.next=loop_Start;
        return llist;
    }
    
    private static boolean detectLoop(LinkedList list){
        
        LinkedList.Node current=list.head;
        Map<Integer, LinkedList.Node> map=new HashMap<>();
        
        map.put(current.data,current.next);
        
        while (current.next!=null){
            current=current.next;
            out.println("looking at node ="+current.data);
            if(map.containsKey(current.next.data) && map.get(current.next.data)==current.next.next){
                out.println("Found loop at "+ current.data +" and removing the loop");
                current.next=null;
                return true;
            }else{
                map.put(current.data,current.next);
            }
        }
        return false;
    }
    
}
