package easy;

public class L1 {
	public static int[] twoSum(int[] nums, int target) {
		
		int[]ans = new int[2];
		int l=nums.length;
		for(int i=0 ; i<l ; i++) {
			for(int j=i+1;j<l-1;j++){
				//if(i==j)break;
				if(nums[i]+nums[j] == target) {
					ans[0]=i;
					ans[1]=j;
				}
			}
		}
		System.out.print("[");
	for(int i=0;i<ans.length;i++){
		
		System.out.print(ans[i]);
		if(i!=ans.length-1){
			System.out.print(",");
		}
	}
	System.out.print("]");
		
		return ans;

	}
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		
		twoSum(nums,target);
	}
}
