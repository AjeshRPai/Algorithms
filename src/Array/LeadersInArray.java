package Array;


/**
 *
 * https://practice.geeksforgeeks.org/problems/leaders-in-an-array/0
 *
 * Write a program to print all the LEADERS in the array.
 * An element is leader if it is greater than all the elements to its right side.
 * The rightmost element is always a leader.
 * */

public class LeadersInArray {
    
    void printLeaders(int arr[], int size) {
        int max_from_right =  arr[size-1];
  
        /* Rightmost element is always leader */
        System.out.print(max_from_right + " ");
        
        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right < arr[i])
            {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }
    
    /* Driver program to test above functions */
    public static void main(String[] args) {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{18, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }


}
