package TRIES;

public class wordbreak {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordbk(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordbk(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String word[] = { "i", "like", "sam", "samsung", "mobile", "ice" };
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        String key = "ilikesam";
        System.out.println(wordbk(key));
        System.out.println(wordbk("key"));
    }
}
