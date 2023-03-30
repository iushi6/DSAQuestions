package StackQuestions;

import java.util.Stack;

public class NextSmallestElement {
	static int[] getSmallestElement(int[] a) {
		Stack<Integer> s = new Stack<>();
		int[] ans = new int[a.length];
		
		for(int i =a.length-1;i>=0;i--) {
			
			
			  while(!s.isEmpty() && a[i]<s.peek()) {
				s.pop();
				}
			
			if(s.isEmpty()) {
				ans[i]=-1;
			}else {
				ans[i]=s.peek();
			}
			
			s.push(a[i]);
		}
		return ans;
		
		}
		
		public static void main(String args[]) {
			int[] a ={4,10,5,18,3,12,7};
			int[] result =getSmallestElement(a);
		
			System.out.println("Ans is : ");
			for(int i =0;i<a.length;i++) {
				System.out.println(result[i]);
			}
		}
		
}
