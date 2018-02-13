package LinkedListAlgorithms;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(5);
        llist.push(6);
        llist.push(12);
        llist.push(11);
    
        llist.push(11);
        printNthNode(llist.head, 0);
    }
    
    //This is a recursive code which is less optimal
    private static int printNthNode(LinkedList.Node head, int i) {
        if (head == null)
            return 0;
        int index=printNthNode(head.next, i)+1;
        if(index == i){
             System.out.println("The item is "+head.data);
        }
        return index;
    }
}