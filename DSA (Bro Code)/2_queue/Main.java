import java.util.Queue;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<String>();

        q.offer("karen");
        q.offer("chad");
        q.offer("steve");
        q.offer("harold");

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.contains("steve"));
        q.poll();
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.peek());
        
        System.out.println(q);

        System.out.println(q.isEmpty());
        

    }    
}
