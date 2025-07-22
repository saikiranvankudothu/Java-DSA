package BinaryTree;

import java.util.*;

public class Preorder {

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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            } //
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // This are codes USING Recursion
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int ln = height(root.left);
        int rn = height(root.right);
        return Math.max(ln, rn) + 1;
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int ln = count(root.left);
        int rn = count(root.right);
        return (ln + rn) + 1;
    }

    public static int sum(Node root) {
        int ans = 0;
        if (root == null) {
            return ans;
        }
        int ln = sum(root.left);
        int rn = sum(root.right);
        ans = ln + rn + root.data;
        return ans;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftdia = diameter(root.left);
        int lh = height(root.left);
        int rigthdia = diameter(root.right);
        int rh = height(root.right);

        int selfdia = lh + rh + 1;
        return Math.max(selfdia, Math.max(leftdia, rigthdia));
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftinfo = diameter2(root.left);
        Info rigthinfo = diameter2(root.right);
        int diam = Math.max(Math.max(leftinfo.diam, rigthinfo.diam), leftinfo.ht + rigthinfo.ht + 1);
        int ht = Math.max(leftinfo.ht, rigthinfo.ht) + 1;
        return new Info(diam, ht);
    }

    public static void kthlevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kthlevel(root.left, level + 1, k);
        kthlevel(root.right, level + 1, k);
    }

    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        // System.out.println(root.data + " is the root node");
        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.levelorder(root);
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
        kthlevel(root, 1, 3);

    }
}
