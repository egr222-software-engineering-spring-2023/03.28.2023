import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringSet {
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();  // arbitrary (unpredictable) order
        Set<String> names = new TreeSet<>();    // "natural" order

        names.add("Jake");
        names.add("Robert");
        names.add("Marisa");
        names.add("Kasey");
        names.add("john");

        System.out.println(names);

        System.out.println(names.size() + " unique words.");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        System.out.println(names);
    }
}