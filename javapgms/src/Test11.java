
public class Test11 {
	
	public static void main(String[] args) {
		
		String s1 = args[0];
		//convert String value into integer type
		int x = Integer.parseInt(s1);
		String s2 = args[1];
		int y = Integer.parseInt(s2);
		
		int z = x+y;
		System.out.println("sum of given two no's is: " + z);
	}

}
