package datastructureTest;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		
		addElements(stack);
        System.out.println("Stack after adding elements: " + stack);
        
        popElements(stack, 2);
        System.out.println("Stack after popping elements: " + stack);
        
        System.out.println("Top element using peek: " + peekElement(stack));
	

	}
	
	private static void addElements(Stack<Integer> stack) {
        stack.push(1);
        stack.push(3);
        stack.push(10);
        stack.push(23);
    }
	
	
	 private static void popElements(Stack<Integer> stack, int count) {
	        for (int i = 1; i <= count; i++) {
	            if (!stack.isEmpty()) {
	                System.out.println("Popped element: " + stack.pop());
	            } else {
	                System.out.println("Stack is empty, cannot pop more elements.");
	                break;
	            }
	        }
	    }

	  private static Integer peekElement(Stack<Integer> stack) {
	        if (!stack.isEmpty()) {
	            return stack.peek();
	        } else {
	            System.out.println("Stack is empty, cannot peek.");
	            return null;
	        }
	    }

}
