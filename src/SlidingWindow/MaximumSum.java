package SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumSum {
    	
    	static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
        { ArrayList<Integer> al=new ArrayList<>();
            PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
            
            for(int i=0;i<k;i++){
                q.add(arr[i]);
            }
            al.add(q.peek());
            q.remove(arr[0]);

            for(int i=1;k+i-1<n;i++){
                q.add(arr[k+i-1]);
                al.add(q.peek());
                q.remove(arr[i]);
            }
            return al;
        }
        
public static void main(String args[]) {
	int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
	int n = arr.length;
	int k =3;
	ArrayList<Integer> ans = max_of_subarrays(arr,n,k); 
	System.out.print("Maximum Sum is : "+ans);
}

}
