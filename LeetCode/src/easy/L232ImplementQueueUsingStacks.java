package easy;

import java.util.Stack;

public class L232ImplementQueueUsingStacks {
	Stack<Integer> queue = new Stack();

	public void push(int x) {
		Stack<Integer> stack = new Stack();
		while (!queue.empty()) {
			stack.push(queue.pop());
		}
		queue.push(x);
		while (!stack.empty()) {
			queue.push(stack.pop());
		}
	}

	public int pop() {
		return queue.pop();
	}

	public int peek() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.empty();
	}

	public static void main(String[] args) {
		MyQueue obj = new MyQueue();
		obj.push(2);
		obj.push(1);
		obj.push(3);
		obj.push(4);
		int param_2 = obj.pop();
		int param_3 = obj.peek();
		boolean param_4 = obj.empty();
		System.out.println("pop:"+param_2);
		System.out.println("peek:"+param_3);
		System.out.println("empty:"+param_4);
	}
}
