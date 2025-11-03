// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
public class ReverseLinkedList {
    Node head; // head of the list

    // Insert node at the end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // store next
            current.next = prev;   // reverse current node's pointer
            prev = current;        // move prev to current
            current = next;        // move to next node
        }
        head = prev; // new head
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original Linked List:");
        list.display();

        // Reverse the list
        list.reverse();

        System.out.println("\nReversed Linked List:");
        list.display();
    }
}
