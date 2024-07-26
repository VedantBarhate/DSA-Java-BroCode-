import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
        // Queue<String> q1 = new PriorityQueue<>(Collections.reverseOrder());
        Queue<String> q1 = new PriorityQueue<>();
        q1.offer("B");
        q1.offer("A");
        q1.offer("C");
        q1.offer("D");
        q1.offer("F");

        while (!q1.isEmpty())
        {
            System.out.println(q1.poll()); 
        }
    }    
}
