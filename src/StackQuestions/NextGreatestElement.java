package StackQuestions;
import java.util.Stack;
public class NextGreatestElement {

	static void getGreatestElement(int[] a) {
	Stack<Integer> s = new Stack<>();
	
	for(int i =a.length-1;i>=0;i--) {
		
		while(!s.isEmpty() && a[i]>=s.peek()) {
			s.pop();
		}
		if(s.isEmpty()) {
			System.out.println("-1");
		}else {
			System.out.println(s.peek());
		}
		
		s.push(a[i]);
		
		if(!s.isEmpty() && a[i]<s.peek()) {
			s.pop();
		}
	}
	
	}
	
	public static void main(String args[]) {
		int[] a ={4,10,5,18,3,12,7};
		getGreatestElement(a);
	}
	
}
