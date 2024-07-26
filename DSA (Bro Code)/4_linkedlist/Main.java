import java.util.LinkedList;

public class Main 
{
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.offer("A");
        ll.offer("B");
        ll.offer("F");
        // ll.poll();
        
        ll.add(2,"E");
        
        System.out.println(ll);
        ll.remove("E");
        System.out.println(ll);

        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        
        ll.addFirst("0");
        ll.addLast("9");

        System.out.println(ll.indexOf("F"));
        System.out.println(ll);

        String f = ll.removeFirst();
        String l = ll.removeLast();
        System.out.println(f);
        System.out.println(l);

    }    
}
