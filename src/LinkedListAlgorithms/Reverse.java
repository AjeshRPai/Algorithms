package LinkedListAlgorithms;
import  LinkedListAlgorithms.LinkedList.Node;


public class Reverse {
    
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        
        llist.add(85);
        llist.add(20);
        llist.add(30);
        llist.add(40);
        
        LinkedList reversed=reverse(llist);
        reversed.printList();
    }
    
    private static LinkedList reverse(LinkedList list){
       Node prev=null;
       Node current=list.head;
       Node next=null;
       
       while (current!=null){
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }
       
       list.head=prev;
       return list;
    }
}
