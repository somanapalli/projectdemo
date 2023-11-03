
public class Test4 {
	
	public void sum(int a, int b)
	{
		System.out.println("integer sum is: " +(a+b));
	}

	public void sum(double a, double b)
	{
		System.out.println("double sum is: " +(a+b));
	}
	
	public static void main(String[] args) {
		
		Test4 obj;//object declaration
		obj= new Test4();//object referencing
		
		
		obj.sum(5, 6);
		obj.sum(4.5,6.7);
	}
}