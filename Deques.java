package datastructureTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.addLast(1);
		deque.addLast(3);
		deque.addFirst(10);
		deque.addLast(23);
		deque.addFirst(2);
		
		System.out.println("After Inserting in to Deque: "+deque);
		
		removeElementsFromEnd(deque,2);
		System.out.println("After Remove Element From End:  "+deque);
		
		removeElementsFromFront(deque,1);
		System.out.println("After Remove Element From Front:  "+deque);
		
		

	}
	
	private static void removeElementsFromEnd(Deque<Integer> deque, int count) {
        for (int i = 0; i < count; i++) {
            if (!deque.isEmpty()) {
                System.out.println("Removed from end: " + deque.removeLast());
            } else {
                System.out.println("Deque is empty, cannot remove more elements from the end.");
                break;
            }
        }
    }
	
	 private static void removeElementsFromFront(Deque<Integer> deque, int count) {
	        for (int i = 0; i < count; i++) {
	            if (!deque.isEmpty()) {
	                System.out.println("Removed from front: " + deque.removeFirst());
	            } else {
	                System.out.println("Deque is empty, cannot remove more elements from the front.");
	                break;
	            }
	        }
	    }


}
