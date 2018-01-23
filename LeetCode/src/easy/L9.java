package easy;

public class L9 {
	//回文 正读反读一样
	 public boolean isPalindrome(int x) {
		 boolean ans;
		 String y=String.valueOf(x);
		 String temp="";
		 int len=y.length();
		
		 for(int j=len-1;j>=0;j--){
				temp+=y.charAt(j);
			
		 }
		if(temp.equals(y)){
			return true;
		}else
		return false;
	        
	    }
	 public static void main(String[] args) {
		L9 l= new L9();
		int x=199;
		l.isPalindrome(x);
	}
}
