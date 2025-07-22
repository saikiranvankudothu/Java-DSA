package BinaryTree;

import java.util.ArrayList;

public class Lowestca {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }
        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if (foundleft || foundright) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // last equal node -> i-1

        Node lca = path1.get(i - 1);
        return lca;
    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);
        if (rightlca == null) {
            return leftlca;
        }
        if (leftlca == null) {
            return rightlca;
        }
        return root;

    }

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftd = lcaDist(root.left, n);
        int rightd = lcaDist(root.right, n);

        if (leftd == -1 && rightd == -1) {
            return -1;
        } else if (leftd == -1) {
            return rightd + 1;
        } else {
            return leftd + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }

    public static int kthancester(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftk = kthancester(root.left, n, k);
        int rightk = kthancester(root.right, n, k);
        if (leftk == -1 && rightk == -1) {
            return -1;
        }
        int max = Math.max(leftk, rightk);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }
        int leftchild = transform(root.left);
        int rightchild = transform(root.right);

        int data = root.data;
        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;

        root.data = newleft + leftchild + newright + rightchild;
        return data;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println("Height of the BT is: " + height(root));
        // System.out.println("count of nodes in BT is: " + count(root));
        // System.out.println("sum of nodes in BT is: " + sum(root));
        // System.out.println("sum of nodes in BT is: " + diameter2(root).diam)
        // System.out.println(lca2(root, 4, 5).data);
        // System.out.println(minDist(root, 4, 7));
        // kthancester(root, 4, 2);
        transform(root);
        preorder(root);

    }
}
