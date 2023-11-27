package B;

public class SList {
    private Node head; // head of the list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to print the LinkedList.
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
    
