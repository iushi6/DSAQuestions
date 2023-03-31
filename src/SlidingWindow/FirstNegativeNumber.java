package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

//To Find first Negative Number in given Size K -------->
public class FirstNegativeNumber {

	static void findNegative(int[]a , int size) {
		int i =0;
		int j =0;
		List<Integer> list = new ArrayList<>();
		while(j<a.length) {
			if(a[j]<0) {
				list.add(a[j]);
			}
			if(j-i+1 < size) {
				j++;
			}
			else if(j-i+1 == size) {
				
				//If List is not Empty ---------->
				if(!list.isEmpty()){
					System.out.println(list.get(0));
				}else{
				//List is Empty --------->
					System.out.println("0");
				}
				if(a[i]<0) {
					list.remove(0);
				}
				i++;
				j++;
				}
		}
	}
	
	//Main 
	public static void main(String args[]) {
		int[] arr = {12,-1,-7,8,-15,30,16,6};
		int sz = 3;
		 findNegative(arr,sz);
		
	}
	
	
}
