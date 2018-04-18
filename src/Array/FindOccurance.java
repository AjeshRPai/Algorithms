package Array;

/**
 *
 *
 *@link https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array/0
 *
 *Given a sorted array of integers, every element appears twice except for one.
 * Find that single one in linear time complexity and without using extra memory.
 *
 * */

public class FindOccurance {
    
    public static void search(int[] arr, int low, int high) {
        if(low > high)
            return;
        if(low == high)
        {
            System.out.println("The required element is "+arr[low]);
            return;
        }
        
        // Find the middle point
        int mid = (low + high)/2;
        
        // If mid is even and element next to mid is
        // same as mid, then output element lies on
        // right side, else on left side
        if(mid % 2 == 0)
        {
            if(arr[mid] == arr[mid+1])
                search(arr, mid+2, high);
            else
                search(arr, low, mid);
        }
        // If mid is odd
        else if(mid % 2 == 1)
        {
            if(arr[mid] == arr[mid-1])
                search(arr, mid-2, high);
            else
                search(arr, low, mid-1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 1, 2,2,3, 4, 4, 5, 5, 6, 6};
        search(arr, 0, arr.length-1);
    }
}
