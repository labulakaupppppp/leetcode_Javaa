package leetcode.code;

public class Leetcode1 {
	 public static int[] twoSum(int[] nums, int target) {
	        int[]ans = new int[2];
			int l=nums.length;
			for(int i=0 ; i<l ; i++) {
				for(int j=i+1;j<l;j++){
					if(nums[i]+nums[j] == target) {
						ans[0]=i;
						ans[1]=j;
					}
				}
			}
			System.out.print("["+ans[0]+","+ans[1]+"]");
			return ans;

	    }
	 public static void main(String[] args) {
		int[] nums={3, 2,4};
		int target=6;
		twoSum(nums,target);
	}	
}
