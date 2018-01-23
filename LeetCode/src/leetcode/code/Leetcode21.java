package leetcode.code;

public class Leetcode21 {
	/**
	 * Definition for singly-linked list.*/
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    	ListNode ans=new ListNode(1);
	    	ListNode l1_0=l1;
	    	ListNode l2_0=l2;
	    	int len1=0,len2=0;
	    	 /*while(l1_0.next!=null)
	         {
	                len1++;
	                l1_0=l1.next;
	         }
	    	 while(l2_0.next!=null)
	         {
	                len2++;
	                l2_0=l2.next;
	         }*/
	    	if(l1==null)return l2;
	    	if(l2==null)return l1;
	    	 if(l1.val<=l2.val){
	    		//ans=l1;
	    		l1.next=mergeTwoLists(l2,l1.next);
	    		return l1;
	    		//l1=l1.next;
	    	 }else{
	    		 //ans=l2;
	    		 l2.next=mergeTwoLists(l1, l2.next);
	    		 return l2;
	    		// l2=l2.next;
	    	 }
	    	/*for(int i=0;i<len1+len2;i++){
	    		if(ans==l1){
	    			if(l2.val>=l1.next.val){
	    				ans.next=l1.next;
	    				l1=l1.next;
	    				ans=ans.next;
	    			}else{
	    				ans.next=l2;
	    				l2=l2.next;
	    				//
	    				ans=ans.next;
	    			}
	    		}else if(ans==l2) {
	    			if(l1.val>=l2.next.val){
	    				ans.next=l2.next;
	    				l2=l2.next;
	    				ans=ans.next;
	    			}else{
	    				ans.next=l1;
	    				l1=l1.next;
	    				ans=ans.next;//
	    			}
	    			ans.next=l2;
	    			ans=ans.next;
	    		}
	    	}
	*/    	
	    	/*while((l1.next!=null)&&(l2.next!=null)){
	    		System.out.println(ans.val);
	    		ans=ans.next;
	    	}
	    	*/
			//return ans;
	        
	    } 
	    public static void main(String[] args) {
	    	
	    	ListNode l1= new ListNode(1);
	    	ListNode l2= new ListNode(2);
	    	ListNode l3= new ListNode(4);
	    	ListNode l4= new ListNode(10);
	    	
	    	l1.next=l3;
	    	l3.next=null;
	    	l2.next=l4;
	    	l4.next=null;
	    	Leetcode21 l= new Leetcode21();
	    	l.mergeTwoLists(l1, l2);
		}
		
}
