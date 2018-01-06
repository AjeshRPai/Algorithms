package LinkedListAlgorithms;

public class MergeTwoLinkedList {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(19);
        llist.push(17);
        llist.push(15);
        
        
        LinkedList llist2 = new LinkedList();
        llist2.push(20);
        llist2.push(18);
        llist2.push(16);
        llist2.push(12);
        
        
        mergeList(llist,llist2);
    }
    
    private static void mergeList(LinkedList llist, LinkedList llist2) {
        LinkedList.Node head1=llist.head;
        LinkedList.Node head2=llist2.head;
        
        LinkedList result=new LinkedList();
        
        
        while (head1!=null || head2!=null){
            if(head1==null){
                result.add(head2.data);
                head2=head2.next;
            }else if( head2==null) {
                result.add(head1.data);
                head1=head1.next;
            }else if(head1.data<head2.data){
                result.add(head1.data);
                head1=head1.next;
            }else {
                result.add(head2.data);
                head2=head2.next;
            }
        }
        
        result.printList();
        
        
    }
    
    
}
