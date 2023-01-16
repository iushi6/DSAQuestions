package LLQuestions;

import java.util.ArrayDeque;
import java.util.Queue;

public class FlattenLinkedList {

//This implementation takes O(N) space complexity ----->>>>>>>.
  public class Node{
		
	  int data;
	  Node next;
	  Node child;
	  
	  public Node(int data, Node next,Node child) {
		  this.data= data;
		  this.next=next;
		  this.data=data;
	  }
	}
  
  public static Node convertList(Node head) {
	  
	  Node curr=head;
	  Queue<Node> q = new ArrayDeque<>();
	  
	  
	  while(curr != null) {
		  
		  if(curr.next == null) {
			  curr.next = q.poll();
		  }
		  
		  if(curr.child != null) {
			  q.add(curr.child);
		  }
		  curr = curr.next;
	  }
	  return head;
  }
  public static void printList(Node head) {
	  Node ptr = head;
	  while(ptr!=null) {
		  System.out.print(ptr.data + "-> ");
	  }
	  
	  System.out.print("Null");
  }
  
  
  public static void main(String args[]) {
	 
	  
  }
	
}
