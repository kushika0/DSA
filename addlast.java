class AddLast {
    
    // Node class to represent each element in the list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail of the LinkedList
    Node head;
    Node tail;

    // Add element at the end (addLast)
    public void addLast(int data) {
        Node newNode = new Node(data);

        // If list is empty → new node becomes head and tail both
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link the new node to the last node
        tail.next = newNode;
        // Update the tail
        tail = newNode;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the code
    public static void main(String[] args) {
        AddLast list = new AddLast();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Linked List:");
        list.printList();
    }
}
