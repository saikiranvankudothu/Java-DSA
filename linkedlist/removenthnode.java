public class removenthnode {
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

    public static void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void remove(int n) {
        Node temp = head;
        for (int i = 0; i < size - n - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        removenthnode obj = new removenthnode();
        obj.addlast(1);
        obj.addlast(2);
        obj.addlast(3);
        obj.addlast(4);
        obj.addlast(5);
        obj.addlast(6);
        // 1->2->3->4->5->6->null
        System.out.println(size);
        obj.printll();
        System.out.println();
        obj.remove(3);
        obj.printll();
    }
}
