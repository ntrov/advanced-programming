
//shahzad.khan@nu.edu.pk

interface singleMethod{
    public void sum(int a,int b);
}

public class week3_2 {
    public static void main(String[] args) {

        singleMethod obj=(int x,int y) -> System.out.println("sum= "+(x+y));
            
        obj.sum(2,2);
    }
}
