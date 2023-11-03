//implementation class cum child class cum business logic cum excution logic
public class i1Impl1 implements i1 {

	@Override
	public void sum(int x, int y) {
		System.out.println("sum is: " +(x+y));
		
	}
	
	public static void main(String[] args) {
		
		i1 obj = new i1Impl1();
		obj.sum(4, 5);
		
	}

}
