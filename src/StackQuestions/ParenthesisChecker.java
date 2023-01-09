package StackQuestions;

import java.util.Stack;

public class ParenthesisChecker {

	static boolean isParenthesisMatching(String str) {
		
		Stack<Character> s = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char cur = str.charAt(i);
			if(isOpening(cur)) {
				s.push(cur);
			}else {
				if(s.isEmpty()) {
					return false;
				}else if(!isMatching(s.peek(),cur)) {
					return false;
				}else {
					s.pop();
				}
			}
		}
		return s.isEmpty();
	}
	
	static boolean isOpening(char c) {
		return (c == '(' || c== '{' || c== '[');
	}
	
    static boolean isMatching(char a, char b) {
		
		return((a=='(' && b ==')') || (a=='{' && b=='}' )||(a=='['&& b==']'));
	}
	
	public static void main(String args[]) {
		String strng="(){[(]}";
	   boolean ans=	isParenthesisMatching(strng);
	   System.out.println(ans);
	}
	
}
