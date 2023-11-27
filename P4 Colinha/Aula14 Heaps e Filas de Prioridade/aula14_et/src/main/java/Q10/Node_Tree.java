package Q10;

public class Node_Tree {
    Integer item;
    Node_Int firstChild;

    public Node_Tree(Integer item) {
        this.item = item;
        this.firstChild = null;
    }

    public void addChild(Node_Int child) {
        if (this.firstChild == null) {
            this.firstChild = child;
        } else {
            Node_Int current = this.firstChild;
            while (current.next != null) {
                current = current.next;
            }
            current.next = child;
        }
    }

    public void ImprimeQtdeFilhos() {
    if (this.firstChild == null) {
        System.out.println("Nó sem filhos...");
    } else {
        int count = 0;
        Node_Int current = this.firstChild;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Quantidade de filhos: " + count);
        }
    }

    public void DobraValoresFilhos() {
        if (this.firstChild == null) {
            System.out.println("Nó sem filhos...");
        } else {
            Node_Int current = this.firstChild;
            while (current != null) {
                current.item *= 2;
                current = current.next;
            }
        } 
    }

    public void imprimeValorFilhos() {
        if (this.firstChild == null) {
            System.out.println("Nó sem filhos...");
        } else {
            Node_Int current = this.firstChild;
            while (current != null) {
                System.out.println(current.item);
                current = current.next;
            }
        }
    }

    public static void main(String args[]){
        Node_Tree root = new Node_Tree(1);
        Node_Int child1 = new Node_Int(2);
        Node_Int child2 = new Node_Int(3);
        Node_Int child3 = new Node_Int(4);
        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);

        System.out.println("Antes de dobrar:");
        root.ImprimeQtdeFilhos();
        root.imprimeValorFilhos();
        root.DobraValoresFilhos();
        System.out.println("Depois de dobrar:");
        root.imprimeValorFilhos();
    }

}
