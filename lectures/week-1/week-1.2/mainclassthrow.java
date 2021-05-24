


public class mainclassthrow {
	
	public static void fn() throws ArithmeticException,ArrayIndexOutOfBoundsException  
	{
		int array[]={1,2,3};
		System.out.println("Division= " + (10/5));
		System.out.println(array[4]);
	}
	
	
	public static void main(String[] args) {
		fn();
		
	}
}
