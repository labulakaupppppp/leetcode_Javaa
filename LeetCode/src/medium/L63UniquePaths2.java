package medium;

public class L63UniquePaths2 {
	/**
	 * Follow up for "Unique Paths":
	 * 
	 * Now consider if some obstacles are added to the grids. How many unique
	 * paths would there be?
	 * 
	 * An obstacle and empty space is marked as 1 and 0 respectively in the
	 * grid.
	 * 
	 * For example,
	 * 
	 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
	 * 
	 * [ [0,0,0], [0,1,0], [0,0,0] ]
	 * 
	 * The total number of unique paths is 2.
	 */
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid == null)
			return 0;
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] visited = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				visited[i][j] = -1;
				System.out.println(i + "," + j + ">" + visited[i][j]);
			}
		}
		int count = movingCount(m, n, 0, 0, visited, obstacleGrid);
		return count;

	}

	public int movingCount(int m, int n, int row, int col, int[][] visited, int[][] obstacleGrid) {
		int count = 0;
		if (row < 0 || col < 0 || row >= m || col >= n)
			return 0;
		if (obstacleGrid[row][col] == 0) {
			if (row == m - 1 && col == n - 1)
				return 1;
			if (visited[row][col] != -1)
				return visited[row][col];
			count = movingCount(m, n, row + 1, col, visited, obstacleGrid)
					+ movingCount(m, n, row, col + 1, visited, obstacleGrid);
			visited[row][col] = count;
		}

		return count;
	}

	public static void main(String[] args) {
		L63UniquePaths2 l63 = new L63UniquePaths2();
		int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int[][] aa = { { 1 } };
		int count = l63.uniquePathsWithObstacles(aa);
		System.out.println(count);

	}
}
