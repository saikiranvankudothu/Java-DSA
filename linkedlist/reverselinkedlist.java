public class reverselinkedlist {
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

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void addlast(int data) {
        Node newNode = new Node(data);
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

    public static void main(String[] args) {
        reverselinkedlist obj = new reverselinkedlist();
        obj.addlast(1);
        obj.addlast(2);
        obj.addlast(3);
        obj.addlast(4);
        obj.addlast(5);
        obj.addlast(6);
        // 1->2->3->4->5->6->null
        obj.printll();
        System.out.println();
        obj.reverse();
        obj.printll();
    }
}