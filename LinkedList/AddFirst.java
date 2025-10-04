class AddFirst {
    // Node class (inner class)
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // head pointer

    // Method to add at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // link new node with current head
        head = newNode;      // update head
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        AddFirst list = new AddFirst();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        list.printList(); // Output: 30 -> 20 -> 10 -> null
    }
}
