package leetcode.code;

public class Leedcode26 {

	public int removeDuplicates(int[] nums) {
        int length=0;
		int k=nums.length;
		int[] replace=new int[k];//重新赋值
		 if(k==1)replace[0]=nums[0];
		 for(int i=0;i<k-1;i++){
			 if(nums[i+1]==nums[i]){
				 replace[length]=nums[i+1];
			 }else{
				 length++;
				 replace[length]=nums[i+1];
			 }
		 }
		 for(int i=1;i<k;i++){
			 nums[i]=replace[i];
		 }
		 
		 for(int i=0;i<k;i++){
			 System.out.println(nums[i]);
		 }
		 length=length+1;
		return length;
   }
	public static void main(String[] args) {
		int[] nums={1,1,2,3,4};
		Leedcode26 l26=new Leedcode26();
		l26.removeDuplicates(nums);
	}
}
