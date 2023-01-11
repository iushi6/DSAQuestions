package StackQuestions;

import java.util.Stack;

public class PostFixEvaluation {
     Stack<Integer> stk = new Stack<>();
     
	public int evaluate(String s) {
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isDigit(c)) {
				stk.push(c-'0');
			}else {
				int b = stk.pop();
				int a = stk.pop();
				
				switch(c) {
				case '+': 
					stk.push(a+b);
				break;
				case '-': 
					stk.push(a-b);
				break;
				case '*':
					stk.push(a*b);
				break;
				case '/': 
					stk.push(a/b);
				break;
				
				}
			}	
			}
		return stk.pop();
		}
	
	public static void main(String args[]) {
		PostFixEvaluation pf = new PostFixEvaluation();
		String str = "32+7*4-";
		int ans =pf.evaluate(str);
		System.out.println("Result of PostfixEvaluation : "+ans);
	}
}
