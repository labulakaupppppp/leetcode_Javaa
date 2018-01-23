package easy;

import java.util.LinkedList;
import java.util.Queue;

public class L225_ImplementStackUsingQueues {
	/*
	 * 用两个栈实现队列 先入先出
	 * 
	 * Implement the following operations of a stack using queues.
	 */
	// push(x) -- Push element x onto stack.

	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();

	public void push(int x) {
		if (queue1.isEmpty() && queue2.isEmpty()) {
			queue1.add(x);
		} else if (!queue1.isEmpty()) {
			queue1.add(x);
		} else {
			queue2.add(x);
		}

	}

	// pop() -- Removes the element on top of the stack.
	public int pop() {
		int size1 = queue1.size();
		int size2 = queue2.size();
		if (size1 > 0) {
			while (size1 > 1) {
				queue2.add(queue1.poll());
				size1--;
			}
			return queue1.poll();
		} else if (size2 > 0) {
			while (size2 > 1) {
				queue1.add(queue2.poll());
				size2--;
			}
			return queue2.poll();
		} else {
			System.out.println("栈为空");
		}
		return 0;
	}

	// top() -- Get the top element.
	public int top() {
		int size1 = queue1.size();
		int size2 = queue2.size();
		int x=0;
		if (size1 > 0) {
			while (size1 > 1) {
				queue2.add(queue1.poll());
				size1--;
			}
			x=queue1.peek();
			 queue2.add(queue1.poll());
		} else if (size2 > 0) {
			while (size2 > 1) {
				queue1.add(queue2.poll());
				size2--;
			}
			x=queue2.peek();
			queue1.add(queue2.poll());
		} else {
			System.out.println("栈为空");
		}
		return x;
	}

	// empty() -- Return whether the stack is empty.
	public boolean empty() {
		int size = queue1.size() + queue2.size();
		return size > 0 ? false : true;
	}

	public static void main(String[] args) {
		//["MyStack","push","push","push","top",
		//"pop","top","pop","top","empty","pop","empty"]
		L225_ImplementStackUsingQueues obj = new L225_ImplementStackUsingQueues();
		obj.push(1);
		System.out.println("top1:" +obj.top());
		obj.push(2);
		System.out.println("top2:" +obj.top());
		obj.push(3);
		System.out.println("top3:" +obj.top());
		
		System.out.println("pop:" +obj.pop() );
		System.out.println("top:" +obj.top());
		System.out.println("pop:" +obj.pop() );
		System.out.println("top:" +obj.top());
		System.out.println("empty:" + obj.empty());
		System.out.println("pop:" +obj.pop() );
		System.out.println("empty:" + obj.empty());
	}
}
