package medium;

public class L153FindMinimumInRotatedSortedArray {
	// 旋转数组的最小数字
	// (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).Find the minimum
	// element.
	public int findMin(int[] nums) {
		System.out.println("进入findMin");
		int min=nums[0];
		int len=nums.length;
		int low=0;
		int high=len-1;
		int mid=(low+high)/2;
		System.out.println("mid:"+mid);
		min=nums[low];
		if(nums[low]<nums[high]){
			System.out.println("min1:"+nums[low]);
			return nums[low];
		}
		while(low<=high){
			if(high-low==1 || high==low){
				System.out.println("min:"+min);
				return nums[high];
			}
			
			if(nums[mid]>nums[high]){
				min=nums[high];
				low=mid;
			}else{
				min=nums[mid];
				high=mid;
			}
			mid=(low+high)/2;
		}
		return min;

	}
	public static void main(String[] args) {
		int[] nums={4, 5, 6, 7, 0, 1, 2};
		int[] nums1={1,2,3,0};
		L153FindMinimumInRotatedSortedArray cc= new L153FindMinimumInRotatedSortedArray();
		int min=cc.findMin(nums1);
		System.out.println(min);
	}
}
