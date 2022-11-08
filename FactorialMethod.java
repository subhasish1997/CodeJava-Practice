
public class FactorialMethod {
	public void fact(int j)
	{
		int sum=1;
	for(int i=1; i<=j; i++) {
		
		sum= sum*i;
		
	}	System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialMethod ob=new FactorialMethod();
		ob.fact(10);

	}

}
