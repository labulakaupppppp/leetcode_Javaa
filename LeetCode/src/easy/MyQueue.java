package easy;

import java.util.Stack;

class MyQueue {
	/**L232ImplementQueueUsingStacks
	 * L232 232. Implement Queue using Stacks Implement the following operations
	 * of a queue using stacks. push(x) -- Push element x to the back of queue.
	 * pop() -- Removes the element from in front of queue. peek() -- Get the
	 * front element. empty() -- Return whether the queue is empty.
	 * 
	 */

	/** Initialize your data structure here. */
	public MyQueue() {

	}

	Stack<Integer> stack1 = new Stack();
	Stack<Integer> stack2 = new Stack();

	/** Push element x to the back of queue. */
	public void push(int x) {
		stack1.push(x);
		
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		int x;
		if(!stack2.empty()){
			x = stack2.pop();
		}
		else{
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());

			}
			x=stack2.pop();
		}
		
		return x;
	}

	/** Get the front element. */
	public int peek() {
		if(stack2.empty()){
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());

			}	
		}
		int x = stack2.peek();
		return x;
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		int size = stack1.size() + stack2.size();
		boolean emp = false;
		if (size == 0) {
			emp = true;
		} else {
			emp = false;
		}
		return emp;
	}

	/**
	 * Your MyQueue object will be instantiated and called as such: MyQueue obj
	 * = new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
	 * obj.peek(); boolean param_4 = obj.empty();
	 */

}
