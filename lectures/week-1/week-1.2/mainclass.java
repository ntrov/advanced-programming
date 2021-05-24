import java.io.*;


public class mainclass {

	public static void main(String[] args) {
		int u,d;
		u=10;
		d=5;
		int array[]={1,2,3,4,5};
		String x=null;
		try{
			System.out.println("Division= " + (u/d));
			System.out.println(array[5]);
			System.out.println(x.length());
		}
		
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("pehla wala catch");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("dosra wala catch");
		}
		catch(Exception e){
			System.out.println(e);	
			System.out.println("tesra wala catch");
		}
		finally{
			System.out.println("this is the rest of code");
		}
		
	}
}
