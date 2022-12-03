import java.util.*;

public class Set extends HashSetDemo {
    public static void main(String[] args) {
        Execute();
        ExecuteLinked();
    }

    public Iterator iterator() {
        return null;
    }
}

/**
 * HashSet
 */
class HashSetDemo extends LinkedHashsetExample {
    public static void Execute() {

        var hs = new HashSet<String>(); // creating hashSet
        hs.add("Apple"); // adding elements
        hs.add("Orange");
        hs.add("Grapes");
        // hs.add("Grapes");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class LinkedHashsetExample {
    public static void ExecuteLinked() {
        var lhs = new LinkedHashSet<String>(); // creating linkedhashset
        lhs.add("Apple"); // adding elements
        lhs.add("Orange");
        lhs.add("Grapes");
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}