
public class PolymorphismDemo {
	
	public void add (int a) 
	{
	a++ ;
		System.out.println(a);
	}
	public void add (int a, int b)
	{
		System.out.println(a+b);
	}
	public void add (char ch)
	{
		System.out.println((int) ch);
	}
	public void add (float x, float y)
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismDemo ob = new PolymorphismDemo();
		
		
		ob.add(9);
		ob.add(2,3);
		ob.add('a');
		ob.add(9.4f,9.2f);
		

	}

}
