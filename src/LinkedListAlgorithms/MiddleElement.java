package LinkedListAlgorithms;

public class MiddleElement {
    
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        for (int i=5; i>0; --i) {
            llist.push(i);
        }
        printMiddle(llist);
    }
    
    private static void printMiddle(LinkedList list) {
        LinkedList.Node slow_ptr = list.head;
        LinkedList.Node fast_ptr = list.head;
        if (list.head != null)
        {
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                    slow_ptr.data + "] \n");
        }
    }
    
}
