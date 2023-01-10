package StackQuestions;

import java.util.Stack;

public class ParenthesisRemove {

	public static String removeOuterParenthesis(String s) {
		        int count = 0;
		        StringBuilder str = new StringBuilder();

		        for(int i = 0; i<s.length(); i++){
		            if( s.charAt(i) == '('){
		                count++;
		                if(count>=2) str.append('(');
		            }else {
		                if(count>=2) str.append(')');
		                count--;
		            }
		        }

		        return str.toString();
		        }
	
	
	public static void main(String args[]) {
		String str = "(()())(())";
		String ans = removeOuterParenthesis(str);
		System.out.println(ans);
		
	}
	
}
