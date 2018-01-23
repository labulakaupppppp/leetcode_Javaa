package easy;

import java.util.Stack;
import easy.ListNode;

public class L206ReverseLinkedList {
	/*
	 * Reverse a singly linked list. 先读入，后输出。典型的先进后出，可用栈来实现。
	 */

	/**
	 * Definition for singly-linked list.
	 * 
	 * public class ListNode { 
	 * 		int val; 
	 * 		ListNode next;
	 * 		ListNode(int x) { val = x; }
	 * }
	 */

	public ListNode reverseList(ListNode head) {
		if (head == null)
			return head;
		Stack<Integer> myStack = new Stack<Integer>();
		ListNode pNode = head;
		while (pNode != null) {
			myStack.push(pNode.val);
			pNode = pNode.next;
		}
		int size = myStack.size();
		ListNode newHead = new ListNode(myStack.peek());
		myStack.pop();
		if (size == 1)
			return newHead;
		ListNode node = new ListNode(myStack.peek());
		newHead.next = node;
		myStack.pop();
		while (!myStack.empty()) {
			node.next = new ListNode(myStack.peek());
			myStack.pop();
			node = node.next;
		}
		while (newHead != null) {
			System.out.println(newHead.val);
			newHead = newHead.next;
		}
		return newHead;

	}
	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = null;
		L206ReverseLinkedList cc = new L206ReverseLinkedList();
		cc.reverseList(head1);

	}
}
