package HashingQuestions;

import java.util.HashMap;

public class LargestSubarraywith0 {
	  static int maxLen(int arr[], int n)
	    {
	        HashMap<Integer , Integer> map =new HashMap<>();
	        int max = 0, sum =0;
	        
	        for(int i =0;i<n;i++){
	            sum += arr[i];
	            if(sum == 0){
	                max = i+1;
	            }else if(map.get(sum)!=null){
	                max = Math.max(max,i-map.get(sum));
	            }else{
	                map.put(sum,i);
	            }
	        }
	        return max;
	    }
	  
	  public static void main(String args[]) {
		 int N = 8;
		 int[] A = {15,-2,2,-8,1,7,10,23};
		int ans= maxLen(A,N);
		System.out.println(ans);
	  }
	}
