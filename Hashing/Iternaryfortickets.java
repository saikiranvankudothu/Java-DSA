package Hashing;

import java.util.*;

public class Iternaryfortickets {
    public static String getstart(HashMap<String, String> tickets) {
        HashMap<String, String> revmap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revmap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revmap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai", "Bangalure");
        hm.put("Mumbai", "Delhi");
        hm.put("Goa", "Chennai");
        hm.put("Delhi", "Goa");

        String start = getstart(hm);
        System.out.print(start);
        for (String key : hm.keySet()) {
            System.out.print(" -> " + hm.get(start));
            start = hm.get(start);
        }

    }
}
