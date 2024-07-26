import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Stack<String> stk = new Stack<String>();
        stk.push("john");
        stk.push("joe");
        stk.push("andrew");
        stk.push("bob");
        // System.out.println(stk.empty());
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        // stk.pop();
        // System.out.println(stk);
        // stk.pop();
        // System.out.println(stk);
        
        String x = stk.pop();
        System.out.println(x);
        System.out.println(stk);
        
        System.out.println(stk.peek());
        System.out.println(stk);

    }
}