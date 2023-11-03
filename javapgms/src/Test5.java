
public class Test5 {
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		
		//using setter methods we can set the data 
		obj.setEmpid(100);
		obj.setEmpname("rama");
		
		//using getter methods we can get the data .
		
		System.out.println("employee id is : " + obj.getEmpid());
		System.out.println("employee name is: " + obj.getEmpname());
		
		
	}

}
