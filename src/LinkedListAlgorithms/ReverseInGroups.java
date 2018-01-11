package LinkedListAlgorithms;

import javax.sound.sampled.Line;

public class ReverseInGroups {
    
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        
        llist.add(10);
        llist.add(20);
        llist.add(30);
        llist.add(40);
        llist.add(50);
        llist.add(60);
        llist.add(70);
        llist.add(80);
        llist.add(90);
        llist.add(100);
        
        LinkedList.Node head=reverseRecursively(llist.head,3);
        LinkedList reverse=new LinkedList();
        while (head!=null){
            reverse.add(head.data);
            head=head.next;
        }
        
        reverse.printList();
    }
    
    private static LinkedList.Node reverseRecursively(LinkedList.Node head, int size){
        
        LinkedList.Node prev=null;
        LinkedList.Node current=head;
        LinkedList.Node next=null;
        int k=0;
        
        while (current!=null && k<size){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            k++;
        }
        
        if(next !=null)
            head.next=reverseRecursively(next,3);
    
    
        return prev;
    }
    
    
    
    
}
