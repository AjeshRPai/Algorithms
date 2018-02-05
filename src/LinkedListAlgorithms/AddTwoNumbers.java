package LinkedListAlgorithms;

public class AddTwoNumbers {
    
    private static LinkedList result=new LinkedList();
    private static int carry=0;
    
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(8);
        llist.push(3);
        
        LinkedList llist2 = new LinkedList();
        llist2.push(2);
        llist2.push(1);
        llist2.push(4);
        llist2.push(1);
        
        addLinkedList(llist,llist2);
        
        result.printList();
    }
    
    private static void addLinkedList(LinkedList llist, LinkedList llist2) {
        LinkedList.Node current = llist.head;
        LinkedList.Node current2= llist2.head;
        addLinkedListUtil(current,current2);
    }
    /*
        3-8-1
        1-4-1-2
        
        Numbers are 183
        And 2141
        Result:2324
    */
    
    private static void addLinkedListUtil(LinkedList.Node current,
                                          LinkedList.Node current2) {
        
        while (current!=null || current2!=null) {
            int sum = (current != null ? current.data : 0)
                    + (current2 != null ? current2.data : 0)
                    + carry;
            if (sum > 9) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }
            System.out.println("Sum =" + sum + " Carry=" + carry);
            result.add(sum);
            
            if(current!=null)
                current=current.next;
            if(current2!=null)
                current2=current2.next;
            
            
        }
        
        
    }
}
