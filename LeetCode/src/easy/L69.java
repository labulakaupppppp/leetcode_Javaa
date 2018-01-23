package easy;
/*
 * Implement int sqrt(int x).

Compute and return the square root of x.
 */
public class L69 {
	 public int mySqrt(int x) {
	        int ans;
	        ans=(int) StrictMath.sqrt(x);
	        System.out.println(ans);
	        return ans;
	    }
	 public static void main(String[] args) {
		L69 l69 = new L69();
		int x=4;
		l69.mySqrt(0);
	}
}
