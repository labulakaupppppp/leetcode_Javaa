package jianzhiOffer;

public class I9Fibonacci {
	public int calFi1(int n) {
		// 递归
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return calFi1(n - 1) + calFi1(n - 2);
	}

	public int calFi2(int n) {
		// 循环
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int one = 0;
		int two = 1;
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			sum = one + two;
			one = two;
			two = sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		I9Fibonacci cc = new I9Fibonacci();
		int sum1 = cc.calFi1(3);
		int sum2 = cc.calFi2(3);
		System.out.println(sum1 + ":" + sum2);
	}
}
