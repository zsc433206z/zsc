package xiti;
public class fenjiezhiyingshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int pv=120;
      for(int i=2;i<=pv;i++)
      {    	  {   while(pv!=i)

    	  if(pv%i==0)
    	  {
    		  System.out.print(i+"*");
    		  pv=pv/i;
    	  }
    	  else
    	  {
    		  break;
    	  }
        }
      }
      System.out.print(pv);
	}
}