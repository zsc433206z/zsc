package anliyi;

public class qwe {
public static void main(String[] args) {
	//十进制
	int  a =10;
	
	// 十六进制
	int b = 0x10;
	
	//八进制
	 int c = 010;
	// 二进制
	 int d = 0B100;
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
	 System.out.println(d);
	 
	 //进制互转
	 //十进制转十六，八，二（短除法）
	 //十六，八，二转十进制（权加法）
	 //十六进制，八转二进制
	//十进制转换其他进制
	 System.out.println(Integer.toBinaryString(100));//二进制
	 System.out.println(Integer.toHexString(100));//16进制
	 System.out.println(Integer.toOctalString(100));//8进制
	 
//0-9:十进制48 
//A-Z:十进制65
//a-z:97
	 
}
   //如果需要浮点计算绝对精确，BigDecimal
}


