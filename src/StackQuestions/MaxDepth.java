package StackQuestions;

public class MaxDepth {

	public static int maxDepth(String s) {
		int len = s.length();
		char[] ch = new char[len];
		int max =0;
		int c =0;
		for(int i =0;i<len;i++){
			ch[i]=s.charAt(i);
			
			if(ch[i]=='(') {
				c++;
			}else if(ch[i]==')') {
				c--;
			}
			if(c>max) {
				max=c;
			}
		}
		return max;
	}
	
	   public static void main(String args[]) {
		String str ="(1)+((2))+(((3)))";
		int ans = maxDepth(str);
		System.out.println("Maximum Depth : "+ans);
	}
}
