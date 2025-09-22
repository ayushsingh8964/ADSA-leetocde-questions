class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class InsertAtStart {
    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);

        Node newNode = new Node(10);
        newNode.next = head;
        head = newNode;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
