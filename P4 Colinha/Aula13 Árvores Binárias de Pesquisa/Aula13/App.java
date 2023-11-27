import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchTree x = new BinarySearchTree();
        // Exercicio 1
        x.addNode(3, "A");
        x.addNode(7, "B");
        x.addNode(8, "C");
        x.addNode(9, "D");
        x.addNode(10, "E");
        x.addNode(5, "F");

        // Exercicio 2
        int k = 17;
        System.out.println("Criando chave " + k);
        x.addNode(k, "K");

        // Exercicio 3
        System.out.println("\nPre-order:");
        x.root.preOrder();

        // Exercicio 4
        System.out.println("\nPost-order:");
        x.root.postOrder();

        // Exercicio 5
        System.out.println("\nIn-order:");
        x.root.inOrder();

        // Exercicio 6
        System.out.println("Buscando chave " + k + "...");
        x.buscaChave(k);
        
        // Exercicio 7
        System.out.println(x.buscaMenor().key + " é o menor elemento da árvore"); 

        // Exercicio 8
        System.out.println("A quantidade de nós é: " + x.QuantidaDeDos());

        // Exercicio 9
        x.root.mediaArvore();

        // Exercicio 10
        x.root.altura();

        // Exercicio 11
        x.root.numeroDeNulls();

        // Exercicio 12
        LinkedList<Integer> lista = x.root.multiplosDeDois();
        System.out.println("Os múltiplos de dois são: " + lista);

        // Exercicio 13
        x.root.soma();
    }
}
