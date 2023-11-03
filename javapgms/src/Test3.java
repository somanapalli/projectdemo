
public class Test3 {

	public static void main(String[] args) {

		int x[]= {10,20,30,40,50,60,70};
		
		System.out.println(x.length);
		
		//System.out.println(x[7]);
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("============");
		
		for(int y:x)
		{
			System.out.println(y);
		}
	}
}
