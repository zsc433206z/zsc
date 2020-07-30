package anliyi;

public class xcgdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num = 209;
           int i=2;
           for(;i<=num-1;i++)
           {
        	   if(num%i==0)
        	   {
        	   System.out.println("不是质数");
        	   break;
           }
	}
	if(i==num)
	{
	    System.out.println("是质数");
	}
  }
}

