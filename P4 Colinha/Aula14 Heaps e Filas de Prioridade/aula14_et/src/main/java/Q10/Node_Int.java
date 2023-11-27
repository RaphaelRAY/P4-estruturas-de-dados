package Q10;

public class Node_Int {
    Integer item;
    Node_Int next;
    Node_Int firstChild;
    Node_Int parent;

    public Node_Int(Integer item) {
        this.item = item;
        this.next = null;
        this.firstChild = null;
        this.parent = null;
    }

    public void addChild(Node_Int child) {
        if (this.firstChild == null) {
            this.firstChild = child;
            child.parent = this;
        } else {
            Node_Int current = this.firstChild;
            while (current.next != null) {
                current = current.next;
            }
            current.next = child;
            child.parent = this;
        }
    }

}
