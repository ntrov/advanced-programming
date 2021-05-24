import java.util.Stack;

public class week2_4 {
    public static void main(String[] args) {
        String str="1010011";
        Stack<Character> stack=new Stack<>();
        for (char ch : str.toCharArray()) {
            if(ch=='1')stack.push(ch); 
            else if(ch==0)stack.pop();
        }
        // if(stack.isEmpty()==true)System.out.println("Zeros and Ones are Equal");
        // else System.out.println("Zeros and Ones are Not Equal");

        // System.out.printf("Hi this is a %d and %s",3,"somestring");
        System.out.printf("Zeros and Ones are %s", (stack.isEmpty())?"Equal":"Not Equal" );
    }
}
