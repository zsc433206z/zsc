package anliyi;

public class zuoye {

	public static void main(String[] args) {
        int a=1000000; 
        int a_1=1000000;
		for(int i=1;i<4;i++)
              {
            	  a*=(1+0.04);
              }
		System.out.println("每个月的利息是"+(a-a_1)/36);
	  
	}
	

}
