package easy;

public class L191NumberOf1Bits {
	 // you need to treat n as an unsigned value
	//将一个整数减去一个1，这个整数的二进制变化是：最右面的1变为0，这一位之后的所有位变为1.
	//如1100 减去一为1011.
	//减1之后的整数与原来的整数做与运算，会把原整数最右面一位变为0.
	//1011 & 1100=1000
    public int hammingWeight(int n) {
        int number=0;
        while(n!=0){
        	number++;
        	n=(n-1)&n;
        }
        return number;
    }
    public int solu2(int n){
    	 int number=0;
    	 int flag=1;
         while(flag!=0){
        	 if((n & flag) !=0){
        		 number++;
        	 }
         	flag=flag<<1;
         }
         return number;
    }
    public static void main(String[] args) {
		L191NumberOf1Bits cc= new L191NumberOf1Bits();
		int number=cc.hammingWeight(2);
		System.out.println(number);
		System.out.println(cc.solu2(3));
	}
}
