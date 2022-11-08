
public class OddMethod {
	public void run(int i) {
		
		if(i%2 ==0) {
		System.out.println("The number is Even");
		}else {
		System.out.println("The number is Odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddMethod ob= new OddMethod();
		
		ob.run(12);

	}

}
