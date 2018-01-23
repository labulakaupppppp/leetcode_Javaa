package medium;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class L15 {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		int len = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < len - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])// 去重的作用
				continue;
			int low = i + 1;
			int high = len - 1;
			while (low < high) {
				int begin = nums[low];
				int end = nums[high];
				int sum = nums[i] + begin + end;

				if (sum == 0) {
					res.add(Arrays.asList(nums[i], nums[low], nums[high]));
					low++;
					high--;
					while (low < high && nums[low] == nums[low - 1])
						low++;
					while (low < high && nums[high] == nums[high + 1])
						high--;
				} else if (sum > 0) {
					high--;
				} else {
					low++;
				}
			}

		}
		return res;

	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		L15 l15 = new L15();
		l15.threeSum(nums);
	}
}
