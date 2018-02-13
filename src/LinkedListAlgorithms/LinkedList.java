package LinkedListAlgorithms;

 class LinkedList {
    
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
            
        }
    
        @Override
        public String toString() {
            return "Value "+data;
        }
    }
    
    void push(int new_data) {
        //This will add the item to the first of the List
        
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    
    
    
    void printList() {
        Node node=head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    void add(int new_data){
        
        //This will add the item to the end of the Linked List
    
        Node new_node = new Node(new_data);
        
        if(head!=null) {
            Node pointer = head;
    
            while (pointer.next != null) {
                pointer = pointer.next;
            }
    
            pointer.next = new_node;
    
        }else {
            head=new Node(new_data);
        }
    }
    
}
