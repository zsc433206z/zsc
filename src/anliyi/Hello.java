package anliyi;
/***
 * 一个。Java文件中可以有多个class，但是只能有一个public修饰的，件名跟public的类名一样
 * 
 * 只有public类中才能有main入口方法
 * 
 * 如果文件中没有public的类，文件名要更其中的一个类的名字相同
 * @author Administrator
 *
 */

public class Hello {

	public static void main(String[] args) {
	System.out.println("Hello Word ");
	System.out.println("Hello China ");
	 //设置常量
	final double  pi = 3.17;
	//整数: byte(一个字节) short（两个字节） int（四个字节） long（八个字节） 
	//-128~127    -2^15~2^15-1     -2^31~2^31-1     -2^63~2^63-1 (L)  
	//对于long型数据，如果超过int范围，在后面加上：L/1，建议用大写
	}
	
	

}
