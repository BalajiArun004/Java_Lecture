import java.util.*;

public class List extends ArrayListExample {
    public static void main(String args[]) {
        // Exceute();
        ExceuteList();
    }
}

class ArrayListExample extends LinkedListDemo {

    public static void Exceute() {
        var al = new ArrayList<String>(); // creating array list
        System.out.printf("Check Empty %b \n", al.isEmpty());
        al.add("apple"); // adding elements
        al.add("orange");
        al.add("grape");
        al.add("banana");
        var al2 = new ArrayList<String>(
                Arrays.asList("Pineapple", "Mulberry", "Guava", "Papaya"));
        al.addAll(al2);

        System.out.printf("Check Empty %b \n", al.isEmpty());
        var itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class LinkedListDemo {

    public static void ExceuteList() {
        // create a linked list
        var ll = new LinkedList<String>();

        // add elements to the linked list
        ll.add("apple"); // adding elements
        ll.add("orange");
        ll.add("grape");
        ll.add("banana");
        ll.addLast("Pineapple");
        ll.addFirst("Mulberry");
        ll.add(1, "Guava");
        System.out.println("Original contents of ll: " + ll);

        // remove elements from the linked list
        ll.remove("Mulberry");
        ll.remove(2);
        System.out.println("Contents of ll after deletion: " + ll);

        // remove first and last elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after deleting first and last: " + ll);

        // get and set a value
        Object val = ll.get(2);
        ll.set(2, (String) val + " Changed");
        System.out.println("ll after change: " + ll);
    }
}