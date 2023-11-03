
public class Child extends Parent1 {

	
	public  void sum(int x, int y) {

		System.out.println("substraction is: " + (x - y));
	}

	public static void main(String[] args) {

		/*
		 * Child obj = new Child(); obj.sum(4, 5);
		 * 
		 * Parent1 obj1 = new Parent1(); obj1.sum(4, 5);
		 */
		
		
		Parent1 p1;//object declaration 
		p1= new Child();//object referencing
		
		p1.sum(3, 4);
		
		
	}
}
