import java.util.ArrayList;
import java.util.List;

class something<abc>{
   public void print(abc arg){
        System.out.println(arg);
    }
}

public class week2_2{
    public static void main(String[] args) {
        something<Integer> obj=new something<Integer>();
        obj.print(2);

        List<Integer> list;
        list=new ArrayList<Integer>();
        
    }
}
