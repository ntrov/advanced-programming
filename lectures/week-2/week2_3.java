import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class week2_3{
    public static void main(String[] args) {
        String colors[]={"blue","red","black","white"};
        List<String> list=new ArrayList<String>();
        List<Character> chars= new ArrayList<Character>();

        int x=4;
        Integer i=x; //Auto Boxing
        x=i; //Auto Unboxing

        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(2);
        stack.push(3);
        // stack.pop();
        // System.out.println("Stack top "+stack.peek());
        
        Queue<String> queue=new PriorityQueue<String>();
        queue.add("1st");
        queue.add("2nd");
        queue.add("3rd");
        // System.out.println("poll "+queue.poll());
        // System.out.println("poll "+queue.poll());

        Set<Integer> set=new HashSet<Integer>();
        // set.add(1);set.add(2);
        set.addAll(stack);
        for (Integer integer : set) {
            // System.out.println(integer);
        }


        Map<String,String> map=new HashMap<>();
        map.put("Black", "#26001b");
        map.put("Red", "#26001b");
        map.put("Pink", "#26001b");
        map.put("Yellow", "#fff600");

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }



    }
}
