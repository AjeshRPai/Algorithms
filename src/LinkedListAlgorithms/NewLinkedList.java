package LinkedListAlgorithms;

class NewLinkedList {
    Node head;
    
    class Node {
        int data;
        Node right;
        Node down;
        
        Node(int data) {
            this.data = data;
            right = null;
            down = null;
        }
        @Override
        public String toString() {
            return "Value " + data;
        }
    }
    
    Node push(Node head_ref, int data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        NewLinkedList.Node new_node = new NewLinkedList.Node(data);
 
        /* 3. Make next of new Node as head */
        new_node.down = head_ref;
 
        /* 4. Move the head to point to new Node */
        head_ref = new_node;
 
        /*5. return to link it back */
        return head_ref;
    }
    
    void printList() {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.down;
        }
        System.out.println();
    }
}
