public class checkpalindrome {
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

    public static Node findmid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

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

    public static void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static boolean ispalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        Node midNode = findmid(head);
        // reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // check
        while (right.next != null) {
            if (right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        checkpalindrome obj = new checkpalindrome();
        obj.addlast(1);
        obj.addlast(2);
        obj.addlast(3);
        obj.addlast(3);
        obj.addlast(2);
        obj.addlast(1);
        // 1->2->3->4->5->6->null
        System.out.println(size);
        obj.printll();
        System.out.println();
        System.out.println(obj.ispalindrome());

    }
}
