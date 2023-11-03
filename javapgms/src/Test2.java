
public class Test2 {
	//class level variables
	int x,y;
	
	public void assign(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	public void getSum()
	{
		System.out.println("sum is: " +(this.x+this.y));
	}
	
	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		obj.assign(3, 4);
		obj.getSum();
		
	}
	
}
