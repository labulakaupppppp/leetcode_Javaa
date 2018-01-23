package leetcode.code;


public class Leetcode2 {
//2017 0409
	 public int reverse(int x)throws NumberFormatException {
		String y="";
		String ans="";	
		y=String.valueOf(x);
		
		int l=y.length();
		if(x>=0){
			for(int i=l-1;i>=0;i--){
				ans=ans+y.charAt(i);
			}
		}else {
			for(int i=l-1;i>0;i--){
				ans+=y.charAt(i);		
				}		
		}	
			long ans1=Long.parseLong(ans);
			int ans2=new Long(ans1).intValue();
			if(ans1>Integer.MAX_VALUE){
				System.out.println("o");
				return 0;
			}
		if(x>=0){
			System.out.println(ans2);
			return ans2;
			
		}else {
			ans2=-ans2;
			System.out.println(ans2);
			return ans2;			
		}     
	 }
	 public static void main(String[] args) {
		 int x=1563847412;
		 Leetcode2 l2= new Leetcode2();
		 l2.reverse(x);
	}
}
