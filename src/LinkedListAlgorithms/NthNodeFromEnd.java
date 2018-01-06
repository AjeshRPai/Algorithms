package LinkedListAlgorithms;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        for (int i = 8; i > 0; --i) {
            llist.push(i);
        }
        printNthNode(llist.head, 5);
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