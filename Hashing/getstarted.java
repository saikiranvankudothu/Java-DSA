package Hashing;

import java.util.*;

public class getstarted {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 89);
        hm.put("nepal", 19);
        hm.put("china", 39);
        hm.put("sri lanka", 819);

        // System.out.println(hm.size());//4
        // System.out.println(hm.get("india"));//89
        // System.out.println(hm.containsKey("china"));//true
        // hm.remove("sri lanka");
        // System.out.println(hm);
        Set<String> keys = hm.keySet();
        for (String k : keys) {
            System.out.println("key : " + k + "  value : " + hm.get(k));
        }
    }
}
