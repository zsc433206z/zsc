package anliyi;

public class lido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=8;
		int n=12;
		int min=m<n ?m:n;
		int result =min;
		for (int i=min;i>=1;i--)
		{
			if(m%i==0 && n%i==0)
			{
				result = i;
				break;
			}
		}
		System.out.println(m+"��"+n+"���Լ��Ϊ��"+result);
	}

}
