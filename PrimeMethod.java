
public class PrimeMethod {
	
	public void disp(int j) {
	boolean f = true;
	int i;
	
	for(i=2; i<j; i++) {
		if(j%i==0) {
			
			f = false;
			}
		}if(f== true){
			System.out.println("It is a Prime Number");
			}else {
				System.out.println("It is not a Prime Number");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeMethod ob= new PrimeMethod();
		
		ob.disp(13);

	}

}
