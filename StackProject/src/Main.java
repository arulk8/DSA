import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        StackDS stack = new StackDS(4);

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Pop elements from the stack
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}