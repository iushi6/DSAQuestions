package QueueQuestions;

import java.util.Stack;

public class QueueUsingStack {
   
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	public QueueUsingStack() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	void push(int data) {
		if(s1.isEmpty()) {
			System.out.println("Queue Is Empty");
		}
		s1.push(data);
		}
	 int pop() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int ans = (int) s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ans;
	}
	 
	 void traverse() {
		 while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		 while(!s2.isEmpty()) {
				s1.push(s2.pop());
				System.out.println(s1.peek());
			}
	 }
	
	
	public static void main(String args[]) {
    QueueUsingStack q = new QueueUsingStack();
    q.push(23);
    q.push(34);
    q.push(24);
    q.traverse();
    q.pop();
    q.pop();
    q.traverse();
	}
}
