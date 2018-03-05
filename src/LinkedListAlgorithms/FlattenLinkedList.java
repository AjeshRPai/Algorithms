package LinkedListAlgorithms;

import static java.lang.System.out;

//Created by Ajesh on 16/02/18
public class FlattenLinkedList {
    
    class NewLinkedList {
        Node head;
    
        class Node {
            int data;
            Node next;
            Node down;
        
            Node(int data) {
                this.data = data;
                next = null;
            }
            @Override
            public String toString() {
                return "Value " + data;
            }
        }
    
        void push(int new_data) {
            //This will add the item to the first of the List
        
        /* 1 & 2: Allocate the TreeNode &
                  Put in the data*/
            Node new_node = new Node(new_data);
 
        /* 3. Make next of new TreeNode as head */
            new_node.next = head;
 
        /* 4. Move the head to point to new TreeNode */
            head = new_node;
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
    }
    
    private static NewLinkedList get_FlattenedLinkedList(NewLinkedList list1, NewLinkedList list2) {
        return list1;
    }
    

}
