import java.util.*;

public class MapDemo extends HashMapDemo {
    public static void main(String[] args) {
        Execute();
        ExecuteSortMap();
    }
}

class HashMapDemo extends SortedMapExample {

    public static void Execute() {

        // Create a hash map
        var hm = new HashMap<String, Double>();

        // Put elements to the map
        hm.put("Apple", 105.00);
        hm.put("Orange", 80.50);
        hm.put("Grapes", 90.00);
        hm.put("PineApple", 150.00);
        hm.put("Guava", 50.00);

        // Get a set of the entries
        var set = hm.entrySet();

        // Get an iterator
        var i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            var me = i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double price = ((Double) hm.get("Apple")).doubleValue();
        hm.put("Apple", price + 20);
        System.out.println("Apple new price: " + hm.get("Apple"));
    }
}

class SortedMapExample {
    public static void ExecuteSortMap() {
        var sm = new TreeMap<Integer, String>();
        sm.put(2, "apple");
        sm.put(3, "orange");
        sm.put(5, "grapes");
        sm.put(4, "pineApple");
        sm.put(1, "guava");
        var s = sm.entrySet();

        var i = s.iterator();
        while (i.hasNext()) {
            var m = i.next();

            int key = (Integer) m.getKey();
            String value = (String) m.getValue();

            System.out.println("Key : " + key
                    + "  value : " + value);
        }
    }
}