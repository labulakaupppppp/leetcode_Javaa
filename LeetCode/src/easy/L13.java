package easy;

import java.util.HashMap;
import java.util.Map;

/*
 * 1.相同的数字连写、所表示的数等于这些数字相加得到的数、如：Ⅲ=3；
2.小的数字在大的数字的右边、所表示的数等于这些数字相加得到的数、 如：Ⅷ=8、Ⅻ=12；
3.小的数字（限于 I、X 和 C）在大的数字的左边、所表示的数等于大数减小数得到的数、如：Ⅳ=4、Ⅸ=9；
4.正常使用时、连写的数字重复不得超过三次；
5.在一个数的上面画一条横线、表示这个数扩大 1000 倍。
*/

public class L13 {
	public int romanToInt(String s) {
		int num1,num2;
		//System.out.println(s);
        Map<Character,Integer> val= new HashMap<>();
        val.put('I', 1);
        val.put('X', 10);
        val.put('C', 100);
        val.put('M', 1000);
        val.put('V', 5);
        val.put('L', 50);
        val.put('D', 500);
        System.out.println(val);
        int len=s.length();
        System.out.println(len);
        int ans=val.get(s.charAt(len-1));
        System.out.println(ans);
        for(int i=len-2;i>=0;i--){
        	num1=val.get(s.charAt(i));
        	num2=val.get(s.charAt(i+1));
        	if(num2<=num1){
        		ans+=num1;
        		//System.out.println(ans);
        	}else{
        		ans-=num1;
        		//System.out.println(ans);
        	}
        	
        }
        return ans;
    }
	public static void main(String[] args) {
		String s="MCMLXXX";
		String s1="III";
		L13 l= new L13();
		l.romanToInt(s);
	}
}
