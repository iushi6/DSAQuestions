package QueueQuestions;

public class MyCircularDeque {
	 int[] arr;
	    int count=0,size=0,front=-1,rear=-1;
	    public MyCircularDeque(int k) {
	        arr=new int[k];
	        size=k;
	    }
	    
	    public boolean insertFront(int value) {
	        if(isFull()) return false;
	        
	        if(front==-1 && rear==-1){ 
	            front=rear=0;
	            arr[front]=value;
	        }else if(front==0){ 
	            front=size-1;   
	            arr[front]=value;
	        }else{ 
	            front--;
	            arr[front]=value;
	        }
	        count++;  
	        return true;
	        
	    }
	    
	    public boolean insertLast(int value) {
	        if(isFull()) return false;
	        
	        if(front==-1 && rear==-1){  
	            front=rear=0;
	            arr[rear]=value;
	        }else if(rear==size-1){ 
	            rear=0;
	            arr[rear]=value;
	        }else{ 
	            rear++;
	            arr[rear]=value;
	        }
	        count++;
	        return true;
	    }
	    
	    public boolean deleteFront() {
	        if(isEmpty()) return false;
	        
	        if (front == rear) {    
	            front = rear = -1;
	        } else if (front == size - 1) { 
	            front = 0;
	        } else {
	            front++;
	        }
	        count--;
	        return true;
	    }
	    
	    public boolean deleteLast() {
	        if(isEmpty()) return false;
	        
	        if (front == rear) {    
	            front = rear = -1;
	        } else if (rear == 0) { 
	            rear = size-1;
	        } else {
	            rear--;
	        }
	        count--;
	        return true;
	    }
	    
	    public int getFront() {
	        return isEmpty()?-1:arr[front];
	    }
	    
	    public int getRear() {
	        return isEmpty()?-1:arr[rear];
	    }
	    
	    public boolean isEmpty() {
	        return count==0;
	    }
	    
	    public boolean isFull() {
	        return size==count;
	    }
}
