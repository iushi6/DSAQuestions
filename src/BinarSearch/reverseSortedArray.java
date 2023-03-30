package BinarSearch;

import java.util.Scanner;

public class reverseSortedArray {

	static int searchIndexOfElement(int[] a, int x) {
		int start = 0;
		int end = a.length-1;
		
		while(start<=end){
			int mid = start - (start - end)/2;
			
			if(a[mid]==x) {
				return mid;
			}else if(x > a[mid]) {
				end  = mid + 1;
			}else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
	 arr[i] = sc.nextInt();		
	}
		int searchIndex = sc.nextInt();
	int ans = searchIndexOfElement(arr, searchIndex);	
	
	System.out.println("Required Index of Element is : "+ans);
  }
}
