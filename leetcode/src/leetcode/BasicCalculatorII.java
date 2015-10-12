package leetcode;

import java.util.Stack;

public class BasicCalculatorII {
    public static int calculate(String s) {
        int result = 0;
        if (s == null || s.length() == 0) {
        	return result;
        }
        
        Stack stack = new Stack();
        
        for (int i = 0; i < s.length(); ) {
        	char curChar = s.charAt(i);
        	
        	if (curChar == ' ') {
        		i ++;
        		continue;
        	}
        	
        	if (curChar == '+' || curChar == '-') {
        		stack.push(Character.valueOf(curChar));
        		i++;
        		continue;
        	}
        	
        	if (curChar == '*' || curChar == '/') {
        		Integer left = (Integer) stack.pop();
        		int right = 0;
        		i++;
        		while (i < s.length() && s.charAt(i) == ' ') {
        			i++;
        		}
        		
        		while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        			right = right * 10 + (s.charAt(i) - '0');
        			i++;
        		}
        		
        		if (curChar == '*') {
        		    int leftValue = left.intValue();
        		    int top = leftValue * right;
        			stack.push(Integer.valueOf(top));
        		} else {
        		    int leftValue = left.intValue();
        		    int top = leftValue / right;
        			stack.push(Integer.valueOf(top));
        		}
        		continue;
        	}
        	
        	int top = 0;
        	while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        		top = top * 10 + (s.charAt(i) - '0');
        	    i++;
        	}
        	stack.push(Integer.valueOf(top));
        	continue;        	
        }
        
        Stack stackCaculate = new Stack();
        while (!stack.isEmpty()) {
        	stackCaculate.push(stack.pop());
        }
        
        
        while (!stackCaculate.isEmpty()) {
        	Integer left = (Integer) stackCaculate.pop();
        	Integer right;
        	
        	if (!stackCaculate.isEmpty()) {
        		Character operator = (Character) stackCaculate.pop();
        		right = (Integer) stackCaculate.pop();
        		if (operator.charValue() == '+') {
        		    int top = left.intValue() + right.intValue();
        		    stackCaculate.push(Integer.valueOf(top));
        		} else {
        			int top = left.intValue() - right.intValue();
        			stackCaculate.push(Integer.valueOf(top));
        		}
        	} else {
        		result = left.intValue();
        	}
        }
 
        return result;
    }
    
    public static void main(String[] args) {
//    	String teststring = "1-1+1";
    	String teststring = "2-1";
    	System.out.println("The result is " + calculate(teststring));
    }
    
}

