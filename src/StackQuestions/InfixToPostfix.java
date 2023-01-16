//package StackQuestions;
//
//import java.util.Stack;
//
//public class InfixToPostfix {
//	
//	Stack<Character> stk = new Stack<>();
//	
//	private String convertPost(String s) {
//		for(int i =0;i<s.length();i++) {
//			char c = s.charAt(i);
//			if(stk.isEmpty() && c =='('){
//				stk.push(c);
//			}else if(!stk.isEmpty() && c<=9 && c>=0) {
//				stk.push(c);}
//			else if()
//				
//			}
//		}
//		
//		return null;
//	}
//	
//
//public static void main(String args[]) {
//	
//	InfixToPostfix itp = new InfixToPostfix();
//	String str ="(3+2)*7-4";
//	String ans = itp.convertPost(str);
//	System.out.println("Infix to Postfix Conversion : "+ans);
//}
//	
//	
//	
//	
//	
//	
//	
//	
//
//	
//}
