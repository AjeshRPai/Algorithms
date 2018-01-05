package LinkedListAlgorithms;

public class LinkedList {
    
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    
}
