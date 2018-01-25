package medium;

import java.util.Arrays;

public class L62UniquePaths {
	/**
	 * A robot is located at the top-left corner of a m x n grid (marked 'Start'
	 * in the diagram below).
	 * 
	 * The robot can only move either down or right at any point in time. The
	 * robot is trying to reach the bottom-right corner of the grid (marked
	 * 'Finish' in the diagram below).
	 * 
	 * How many possible unique paths are there?
	 */
	public int uniquePaths(int m, int n) {

		int[][] visited = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				visited[i][j] = -1;
				System.out.println(i + "," + j + ">" + visited[i][j]);
			}
		}
		int count = movingCount(m, n, 0, 0, visited);
		return count;

	}

	public int movingCount(int m, int n, int row, int col, int[][] visited) {
		int count = 0;
		if (row < 0 || col < 0 || row >= m || col >= n)
			return 0;
		if (row == m - 1 && col == n - 1)
			return 1;
		if (visited[row][col] != -1)
			return visited[row][col];
		count = movingCount(m, n, row + 1, col, visited) + movingCount(m, n, row, col + 1, visited);
		visited[row][col] = count;
		return count;
	}

	public int Solution2(int m, int n) {
		int[] row = new int[n];
		Arrays.fill(row,1);
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				row[j]+=row[j-1];

			}
		}
		return row[n-1];
	}

	public static void main(String[] args) {
		L62UniquePaths cc = new L62UniquePaths();
		int count = cc.uniquePaths(3, 4);
		System.out.println(count);
	}
}
