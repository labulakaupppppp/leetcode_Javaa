package medium;

import leetcode.code.Leetcode21;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
 * @author yum717
 *
 */
public class L2 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    int carry = 0;
	    ListNode p, dummy = new ListNode(0);
	    p = dummy;
	    while (l1 != null || l2 != null || carry != 0) {
	        if (l1 != null) {
	            carry += l1.val;
	            l1 = l1.next;
	        }
	        if (l2 != null) {
	            carry += l2.val;
	            l2 = l2.next;
	        }
	        p.next = new ListNode(carry%10);
	        carry /= 10;
	        p = p.next;
	       
	    } 
	    while(dummy.next!=null){
		System.out.println(dummy.next.val);
		dummy=dummy.next;
	}
	
	    return dummy.next;
	} 
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2= new ListNode(5);
		ListNode l3 = new ListNode(4);
		ListNode l4= new ListNode(3);
		l1.next=l3;
		l3.next=l4;
		l4.next=null;
		ListNode l23= new ListNode(6);
		ListNode l24 = new ListNode(4);
		l2.next=l23;
		l23.next=l24;
		l4.next=null;
		L2 l= new L2();
    	l.addTwoNumbers(l1,l2);
		
	}
}
