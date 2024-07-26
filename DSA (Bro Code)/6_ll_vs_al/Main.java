import java.util.LinkedList;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();

        long start;
        long end;
        long elapsed;

        for (int i=0; i<1000000; i++)
        {
            ll.add(i);
            al.add(i);
        }

        // for LL
        start = System.nanoTime();
        // ll.get(0);
        // ll.get(500000);
        // ll.get(999999);
        // ll.remove(0);
        // ll.remove(500000);
        ll.remove(999999);
        end = System.nanoTime();
        elapsed = end - start;
        System.out.println("LinkedList: " + elapsed + "ns");
        
        // for AL
        start = System.nanoTime();
        // al.get(0);
        // al.get(500000);
        // al.get(999999);
        // al.remove(0);
        // al.remove(500000);
        al.remove(999999);
        end = System.nanoTime();
        elapsed = end - start;
        System.out.println("ArrayList: " + elapsed + "ns");
        
    }
    
}