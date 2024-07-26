
public class Main
{
    public static void main(String[] args)
    {
        Dynamicarray da = new Dynamicarray(5);
        // System.out.println(da.capacity);

        da.add("a");
        da.add("b");
        da.add("c");
        da.add("d");
        da.add("e");
        da.add("f");
        da.add("g");

        da.delete("a");
        da.delete("b");
        da.delete("c");
        da.delete("d");
        // da.delete("e");
        // da.delete("f");


        // da.insert(0,"x");

        // System.out.println(da.search("c"));
        
        System.out.println(da);
        System.out.println(da.size);
        System.out.println(da.capacity);
        // System.out.println(da.isEmpty());

    }    
}
