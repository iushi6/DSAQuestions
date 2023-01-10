package StackQuestions;

import java.util.Stack;

public class InfixToPostfix {

	static String convertIt(String s) {
	Stack<Character> stk = new Stack<>();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='(') {
			stk.push(s.charAt(i));
		}else if((s.charAt(i)!='(')||(s.charAt(i)!=')')||(s.charAt(i)!='+')||(s.charAt(i)!='-')||(s.charAt(i)!='*')||(s.charAt(i)!='/')) {
			System.out.print(s.charAt(i));
		}else if((s.charAt(i)=='+')||(s.charAt(i)=='-')||(s.charAt(i)=='*')||(s.charAt(i)=='/')) {
		
		}
	}
	
	return null;
}
	
	
	
	
	public static void main(String args[]) {
		String str= "(3+2)*7-4";
		String ans = convertIt(str);
	}
}
