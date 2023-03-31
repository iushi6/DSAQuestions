package SlidingWindow;

//Fixed Window first Question --->
public class MaxSumSubArray {

	static int findMaxSubArray(int[]a, int size) {
		int i =0;
		int j =0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		while(j < a.length) {
		sum += a[j];
		
		if(j-i+1 < size){
			j++;
		}else if(j-i+1 == size) {
			max = Math.max(max,sum);
			sum = sum - a[i];
			i++;
			j++;
		}
		}
		return max;
	}
	
	public static void main(String args[]) {
		int[] arr = {2,8,9,4,9,0,5,6,8};
		int sz = 3;
		int ans = findMaxSubArray(arr,sz);
		System.out.print("Maximum Sum of Subarray is : "+ans);
	}
}