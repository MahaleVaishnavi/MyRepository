package practice_prm;
import java.util.Stack;
public class StackExample
{
    public static void main(String[]args)
    {
        Stack<Integer>stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.contains(3));
        System.out.println(stack.peek());
        System.out.println(stack.size());
        int element=stack.search(2);
        System.out.println(element);
    }
}