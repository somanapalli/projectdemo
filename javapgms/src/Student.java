
public class Student {
	
	int stid;
	String stname;
	
	//default constructor
	public Student()
	{
		//call current class parameterized constructor 
		this(200,"techm");
		
		stid=100;
		stname="rama";
		this.display();
		
	}
	
	//parameterized constructor 
	public Student(int x, String y)
	{
		stid=x;
		stname=y;
		this.display();
	}
	
	public void display()
	{
		System.out.println("student id is: " + stid);
		System.out.println("student name is: " + stname);
		System.out.println("==============");
	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		
		//obj.display();
		
		
	}
}
