package easy;

public class L27 {
	// Remove Element
	public int removeElement(int[] nums, int val) {
		int ans;
		int len = nums.length;
		ans = len;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] == val) {
				ans--;

			} else {
				nums[count] = nums[i];
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(nums[i]);
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		L27 l27 = new L27();
		int[] nums = { 2, 2, 2, 2, 3 };
		int val = 3;
		l27.removeElement(nums, val);
	}
}
