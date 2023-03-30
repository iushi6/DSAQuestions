package BinarSearch;
public class elementCount {
	// For finding First Index of Element ------>
	static int firstIndex(int[]a , int x) {
		
		int s = 0;
		int e = a.length-1;
		int first =-1;
		while(s<=e) {
			int m = s - (s-e)/2;
			
			if(a[m]==x) {
				first = m;
				e = m -1;
			}else if(a[m]<x) {
				s = m + 1;
			}else {
				e = m - 1;
			}
		}
		if(first != -1) {
			return first;
		}else {
		return -1;
	}
	}
	
	//For Finding Last Index Of Element ------>
	static int lastIndex(int[]a, int x) {
		int s = 0;
		int e = a.length-1;
		int last = -1;
		while(s<=e) {
			int m = s - (s-e)/2;
			
			if(a[m]==x) {
				last = m;
				s = m + 1;
			}else if(a[m]<x) {
				s = m + 1;
			}else {
				e = m - 1;
			}
		}
		if(last != -1) {
			return last;
		}else {
		return -1;
	}
	}
	
	
	public static void main(String args[]) {
		int[] a = {2,4,10,10,10,18,20};
		int num = 10;
		
		int f = firstIndex(a,num);
		int l =lastIndex(a,num);
		int ans = l - f + 1;
		System.out.println(num + " Comes "+ ans + " times in the Array");
	}
	
	
}
