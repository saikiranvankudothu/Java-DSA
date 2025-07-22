public class fistcode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addmiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node prevNode = head;
        for (int i = 0; i < idx - 1; i++) {
            prevNode = prevNode.next;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;

    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("Empty linked list");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("Empty linked list");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prevNode = head;
        for (int i = 0; i < size - 2; i++) {
            prevNode = prevNode.next;
        }
        int val = tail.data;
        prevNode.next = null;
        tail = prevNode;
        size--;
        return val;
    }

    public static void main(String[] args) {
        fistcode ll = new fistcode();
        ll.addFirst(23);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addlast(56);
        // ll.printll();
        // ll.addmiddle(2, 7879);
        // System.out.println();
        // ll.printll();
        // System.out.println("size:" + size);
        // System.out.println(ll.removefirst());
        ll.printll();
        System.out.println();
        System.out.println(ll.removelast());
        ll.printll();

    }
}
