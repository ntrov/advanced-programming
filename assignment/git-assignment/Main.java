import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();

        
        // Adding values to the list.
        for(int i = 1; i <= 10; i++) {
            intList.add(i);
        }


        // Printing values from list.
        for (Integer i : intList) {
            System.out.print(Integer.toString(i) + ", ");
        }
    }
}