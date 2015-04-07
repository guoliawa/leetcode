package leetcode;

import java.util.*;

public class ValidParentheses {
	
    public boolean isValid(String s) {
    	if (s.length() <= 0) return false;
    	Stack<Character> stack = new Stack<Character>();
    	
    	stack.push(s.charAt(0));
    	
    	for (int i = 1; i < s.length(); i++) {
    		char curChar = s.charAt(i);
    		if (curChar == '(' || curChar == '[' || curChar == '{') {
    			stack.push(curChar);
    			continue;
    		}

			char curTop = ' ';
			if (!stack.empty()) curTop = (char) stack.peek();
    		
    		if ( curChar == ')' && curTop != '(') {
    			return false;
    		}
    		
    		if ( curChar == ']' && curTop != '[') {
    			return false;
    		}
    		
    		if ( curChar == '}' && curTop != '{') {
    			return false;
    		}
    		
    		stack.pop();
    	}
    	
    	if (!stack.empty()) return false;
		return true;        
    }
    	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String testString1 = "[])";
        String testString2 = "((([{])))}";
        ValidParentheses vp = new ValidParentheses();
        System.out.println(testString1 + " is " + (vp.isValid(testString1) ? true : false));
        System.out.println(testString2 + " is " + (vp.isValid(testString2) ? true : false));
	}

}
