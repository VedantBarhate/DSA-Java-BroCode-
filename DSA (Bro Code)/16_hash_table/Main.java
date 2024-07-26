
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Hashtable<String ,String> table = new Hashtable<>(21);

        table.put("100", "Bob");
        table.put("123", "pat");
        table.put("321", "sandy");
        table.put("555", "squid");
        table.put("777", "gary");

        for (String key : table.keySet())
        {
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + table.get(key));            
        }


    }
}
