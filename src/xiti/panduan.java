package xiti;
public class panduan {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
          int q=987;
          for(int i=1;;i++)
          {
        	  q=q/10;
        	  if(q==0){
        		  System.out.println(i);
        		  break;
        	  }
        	  
          }
	}*/
	public static void main(String[] args) {
          /*int q=1234,a,b,c,d;
          a=q/1000;
          b=q/100%10;
          c=q/10%10;
          d=q%10;
          System.out.println("倒叙输出为"+d+c+b+a);*/
		/*企业发放的奖金根据利润提成。
		利润低于或等于10万元时，奖金可提10%；
		利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
		20万到40万之间时，高于20万元的部分，可提成5%；
		40万到60万之间时高于40万元的部分，可提成3%；
		60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
		在程序中设定一个变量为当月利润，求应发放奖金总数？*/
           
           double lr=105;
           double jj;
           if(lr<=10){
        	   jj=0.1*10;
        	   }
           if(lr<=20){
            	jj=0.1*10+(lr-10)*0.075;   
            }else if(lr<=40){
            	jj=0.1*10+0.1*0.075+(lr-20)*0.05;
            }else if(lr<=60){
            	jj=0.1*10+0.075*10+0.05*20+(lr-40)*0.03;
            }else if(lr<=100){
            	jj=0.1*10+0.075*10+0.05*20+0.03*20+(lr-60)*0.015;
            }else
            {
            	jj=0.1*10+0.075*10+0.05*20+0.03*20+0.015*40+(lr-100)*0.01;
            }
           System.out.println("应发放工资数为："+lr+"万元");
           System.out.println("应发放奖金总数为："+jj+"万元");
           System.out.println("应发放工资总数为："+(jj+lr)+"万元");
	}
}