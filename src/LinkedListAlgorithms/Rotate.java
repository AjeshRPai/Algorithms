package LinkedListAlgorithms;
import  LinkedListAlgorithms.LinkedList.Node;
import static java.lang.System.*;

public class Rotate {
    
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);
        llist.add(6);
        llist.add(7);
        llist.add(8);
        
        
        LinkedList rotated=rotate(llist,3);
        rotated.printList();
    }
    
    private static LinkedList rotate(LinkedList list,int position){
        
        if(position==0){
            out.println("Invalid Position");
            return list ;
        }
    
        Node current=list.head;
    
        int pointer=1;
        
        while (pointer < position && current!=null ) {
            current=current.next;
            pointer++;
        }
        
        if(current==null){
            out.println("Position is greater than the no of elements");
            return list;
        }
        
        Node pivotNode=current;
        
        while (current.next!=null)
            current=current.next;
        
        
        System.out.println(" "+list.head);
        
        current.next=list.head;
        
        list.head=pivotNode.next;
        
        pivotNode.next=null;
        
        return list;
    }
}
