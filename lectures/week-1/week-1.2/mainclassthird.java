
public class mainclassthird {

	public static void fn2(String str)throws Exception {
		int x=0;
		for(int i=0;i<str.length();i++){
			if('('==str.charAt(i))
				x++;
			else if(')'==str.charAt(i))
				x--;
		}
		if(x!=0){
			throw new Exception("Equation Error");
		}
			
	}
	
	public static void main(String[] args) {
		try{
		fn2("(a+b)+c+d+((f+j)+(h+g)))");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
