package medium;

public class L50MyPow {

	public double myPow(double x, int n) {
		long N = n;
		double result = 1.0;
		if ((x - 0.0 < -0.000000000001) && n < 0) {
			return 0.0;
		}
		if (N < 0) {
			N = -N;
			x = 1 / x;
		}
		double current_product = x;
		for (long i = N; i > 0; i /= 2) {
			if ((i % 2) == 1) {
				result = result * current_product;
			}
			current_product = current_product * current_product;
		}
		return result;
	}

	public double mypow(double x, int n) {
		double nn = n;
		return Math.pow(x, nn);
	}

	public static void main(String[] args) {
		L50MyPow cc = new L50MyPow();
		System.out.println(cc.myPow(-2, 2));
		System.out.println("!!!!!!!!!!!!!!!!!!!");
		double re = cc.myPow(34.00515, -3);
		System.out.println(re);
		System.out.println(Math.pow(2.0, 3.0));
		System.out.println("hah" + cc.myPow(0.00001, 2147483647));
	}
}
