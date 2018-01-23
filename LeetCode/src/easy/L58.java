package easy;

public class L58 {
	public int lengthOfLastWord(String s) {
		if ((s == "") || (s == " "))
			return 0;
		//s = s.trim();
		/*
		 * lastIndex方法 int BlankIndex=s.lastIndexOf(" ")+1;//从0开始 int
		 * ans=s.length()-BlankIndex; System.out.println(ans);
		 */
		// 手写lastindex
		int ans = 0;
		int leng=0;
		for (int i = s.length(); i > 0; i--) {
			char lengzimu = s.charAt(i - 1);
			if (lengzimu == ' '){
				leng++;
			}
			if(lengzimu!=' ')break;
		}
		int k=s.length()-leng;
		System.out.println(k);
		for(int i=k;i>0;i--){
			char zimu = s.charAt(i - 1);
			if (zimu != ' '){
				ans++;
			}
			if(zimu==' ')
				break;
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		L58 l58 = new L58();
		String s = "Hello W orld   ";
		l58.lengthOfLastWord(s);
	}
}
