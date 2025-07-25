package Hashing;

import java.util.*;

public class Iteratorhashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("delhi");
        set.add("mumbai");
        set.add("hyd");
        set.add("chennai");

        // Iteration on hash set
        // Iterator it = set.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // enhanced for loop
        // for (String city : set) {
        // System.out.println(city);
        // }
        System.out.println(set);
        // linked hash set
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("hyd");
        lhs.add("chennai");
        System.out.println(lhs);
        // tree set
        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("hyd");
        ts.add("chennai");
        System.out.println(ts);

    }
}
