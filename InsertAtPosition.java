class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class InsertAtPosition {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node newNode = new Node(15);
        int pos = 2; // insert at position 2 (0-based index)
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
