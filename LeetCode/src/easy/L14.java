package easy;

public class L14 {

	public String longestCommonPrefix(String[] strs) {
		String ans = "";
		if (strs.length == 0 || strs == null) {
			return "";
		}
		if(strs.length==1) ans=strs[0];
		
		String min = strs[0];

		for (int i = 1; i < strs.length; i++) {// strs数组中字符串的个数
			//System.out.println(strs.length);
			
			while (strs[i].indexOf(min) != 0) {
				min = min.substring(0, min.length() - 1);
			}
			ans=min;
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		L14 l14 = new L14();
		String[] strs = {"a","a","b"};
		l14.longestCommonPrefix(strs);
	}
}
