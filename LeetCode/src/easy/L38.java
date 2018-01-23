package easy;

/*
 * The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string. 
 */
public class L38 {
	public String countAndSay(int n) {
		String curr=new String("1");
		String ans;
		//if(n==1) return "1";
		int temp;
		char a;
		for(int i=1;i<n;i++){//循环n
			ans=curr;
			curr=new String();
			temp=1;
			int length=ans.length();
			a=ans.charAt(0);
			for(int j=1;j<length;j++){//循环上一个ans
				
				if(ans.charAt(j)!=a){
					curr+=temp;
					curr+=a;
					//curr.append(temp).append(a).toString();
					temp=1;
					a=ans.charAt(j);
					//System.out.println(ans);
				}else{
					temp++;
				}
				
			}
			curr+=temp;
			curr+=a;
		}
		System.out.println(curr);
		return curr;
	}

	public static void main(String[] args) {
		L38 l38 = new L38();
		l38.countAndSay(9);
	}
}
