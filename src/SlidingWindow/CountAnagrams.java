package SlidingWindow;

import java.util.*;

public class CountAnagrams {

	static int findNumber(String str1,String str2,int sz) {
		int i =0;
		int j=0;
		Map<Character,Integer> map = new HashMap();
		int count =0;
		int ans =0;
		
		while(j<str2.length()) {
			
			if(j-i+1 < sz) {
			
				j++;
				
			}else if(j-i+1 == sz){
				
				
			}
			
		}
		
		return ans;
	}
	
	
	public static void main(String args[]) {
		
		String str = "abaababaaba";
		String pattern ="abaa";
		int size = pattern.length();
		int count = findNumber(str,pattern,size);
		System.out.println("Total Count : "+count);
	}
}
