package medium;

public class SearchA2DMatrix {
	/*
	 * 
	 * [ [1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50] ] Given target = 3,
	 * return true. idea: 从数组的左下 或右上开始查找均可。
	 */
	public boolean searchMatrix(int[][] matrix, int target) {

		boolean find = false;
		int rows, cols;
		if (matrix == null || matrix.length==0) {
			rows = 0;
			cols = 0;
		} else {
			rows = matrix.length;
			cols = matrix[0].length;
		}

		System.out.println(cols + " rows=" + rows);
		if (matrix != null && rows > 0 && cols > 0) {
			int row = 0;
			int col = cols - 1;
			while (row < rows && col >= 0) {
				if (matrix[row][col] == target) {
					find = true;
					break;
				}

				else if (matrix[row][col] > target) {
					col--;
				} else {
					row++;
				}
			}
		}

		return find;
	}

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };

		int[][] matrix = {};
		int target = 55;
		SearchA2DMatrix cc = new SearchA2DMatrix();
		boolean find = cc.searchMatrix(matrix, target);
		System.out.println(find);
	}
}
