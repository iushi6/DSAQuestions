package SlidingWindow;

public class CountAnagrams {

	static int findNumber(String str1,String str2,int k) {
		int i =0;
		int j=0;
		int count =0;
		int ans =0;
		while(j<str1.length()) {
			
			if(j-i+1 < k) {
				j++;
				
			}else if(j-i+1 == k){
				
				if(count == 0) {
					ans++;
				}
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
