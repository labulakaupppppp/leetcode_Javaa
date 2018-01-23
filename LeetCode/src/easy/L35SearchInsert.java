package easy;

public class L35SearchInsert {
	/**
	 * Here are few examples. [1,3,5,6], 5 → 2 [1,3,5,6], 2 → 1 [1,3,5,6], 7 → 4
	 * [1,3,5,6], 0 → 0
	 * 
	 * @author yum717
	 */

	public int searchInsert(int[] nums, int target) {
		int pos = 0;
		int len = nums.length;
		// System.out.println(len);4
		for (int i = 0; i < len; i++) {
			if ((nums[i] == target) || (nums[i] > target)) {
				pos = i;
				break;
			} else {
				pos = len;
				continue;
			}
		}

		System.out.println(pos);
		return pos;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		L35SearchInsert l = new L35SearchInsert();
		l.searchInsert(nums, target);

	}

}
