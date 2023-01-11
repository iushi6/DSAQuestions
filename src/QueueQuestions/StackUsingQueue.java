package QueueQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	private Queue<Integer> queue = new LinkedList<>();


	
	public void push(int x) {
		queue.add(x);
		for(int i = 1;i<queue.size();i++) {
			queue.add(queue.remove());
		}
	}
	    public int pop() {
			return queue.remove();
		}

		public int top() {
			return queue.peek();
		}

		public boolean empty() {
			return queue.isEmpty();  
		}
		
		public void Display() {
			while(queue!=null) {
				System.out.println(queue.toString());
			}
		}
	
	public static void main(String args[]) {
		
		StackUsingQueue sq = new StackUsingQueue();
		sq.push(23);
		sq.push(35);
		sq.empty();
		sq.top();
		sq.push(67);
		
		
	}
	
}
