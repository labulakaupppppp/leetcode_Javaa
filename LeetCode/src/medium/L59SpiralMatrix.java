package medium;

public class L59SpiralMatrix {
	/**
	 * Given an integer n, generate a square matrix filled with elements from 1
	 * to n2 in spiral order.
	 * 
	 * For example, Given n = 3, You should return the following matrix:
	 * 
	 * [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]
	 * 
	 */
	public int[][] generateMatrix(int n) {
		int[][] ans = new int[n][n];
		boolean[][] visit = new boolean[n][n];
		int row = 0;
		int col = 0;
		int ind = 0;
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		for (int i = 0; i < n * n; i++) {
			ans[row][col] = i + 1;
			visit[row][col] = true;
			int newRow=row+dr[ind];
			int newCol=col+dc[ind];
			if(newRow>=0 && newRow<n && newCol>=0 && newCol<n && !visit[newRow][newCol]){
				row=newRow;
				col=newCol;
			}else{
				ind=(ind+1)%4;
				row+=dr[ind];
				col+=dc[ind];
			}
		}
		return ans;
	}
	public void print(int[][] ans,int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		L59SpiralMatrix cc= new L59SpiralMatrix();
		int n=4;
		int[][] ans= cc.generateMatrix(n);
		cc.print(ans, n);
	}
}
