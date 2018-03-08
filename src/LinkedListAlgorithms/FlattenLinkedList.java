package LinkedListAlgorithms;

//Created by Ajesh on 16/02/18
public class FlattenLinkedList {
    
    
    
    static NewLinkedList.Node merge(NewLinkedList.Node a, NewLinkedList.Node b){
        if(a==null)return b;
        if(b==null)return a;
    
        NewLinkedList.Node result;
        
        if(a.data<b.data){
            result=a;
            result.down=merge(a.down,b);
        }else{
            result=b;
            result.down=merge(a,b.down);
        }
        
        return result;
    }
    
    static NewLinkedList.Node flatten(NewLinkedList.Node root) {
        if (root == null || root.right == null)
            return root;
        
        // recur for list on right
        root.right = flatten(root.right);
        
        // now merge
        root = merge(root, root.right);
        return root;
    }
    
    
    
    
    
    public static void main(String[] args) {
    
        NewLinkedList L = new NewLinkedList();
 
        /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */
    
        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);
    
        L.head.right = L.push(L.head.right, 20);
        L.head.right = L.push(L.head.right, 10);
    
        L.head.right.right = L.push(L.head.right.right, 50);
        L.head.right.right = L.push(L.head.right.right, 22);
        L.head.right.right = L.push(L.head.right.right, 19);
    
        L.head.right.right.right = L.push(L.head.right.right.right, 45);
        L.head.right.right.right = L.push(L.head.right.right.right, 40);
        L.head.right.right.right = L.push(L.head.right.right.right, 35);
        L.head.right.right.right = L.push(L.head.right.right.right, 20);
    
        // flatten the list
        L.head = flatten(L.head);
    
        L.printList();
        
    }
    

}
