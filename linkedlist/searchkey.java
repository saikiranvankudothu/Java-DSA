public class searchkey {
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

    public static int search(int key) {
        Node see = head;
        for (int i = 0; i < size; i++) {
            if (see.data == key) {
                return i;
            } else {
                see = see.next;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        searchkey obj = new searchkey();
        obj.addlast(1);
        obj.addlast(2);
        obj.addlast(3);
        obj.addlast(4);
        obj.addlast(5);
        obj.addlast(6);
        // 1->2->3->4->5->6->null
        System.out.print(search(4));
    }
}
