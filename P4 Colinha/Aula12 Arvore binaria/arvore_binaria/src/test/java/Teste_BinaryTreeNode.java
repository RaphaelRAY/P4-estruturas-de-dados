import arvore.*;


public class Teste_BinaryTreeNode {
    public static void main(String[] args ) {
        BinaryTree x = new BinaryTree();
        x.insert_root(0);
        BinaryTreeNode no_1 = new BinaryTreeNode(1) ;
        BinaryTreeNode no_2 = new BinaryTreeNode(2) ;
        BinaryTreeNode no_3 = new BinaryTreeNode(3) ;
        BinaryTreeNode no_4 = new BinaryTreeNode(4) ;
        BinaryTreeNode no_5 = new BinaryTreeNode(5) ;
        BinaryTreeNode no_6 = new BinaryTreeNode(6) ;

        adicionar_filhos(no_1, no_2, x.root);
        adicionar_filhos(no_3, no_4, no_2);
        adicionar_filhos(no_5, no_6, no_3);
        
        System.out.println("2)");
        x.root.preOrder();
        System.out.println();

        x.root.postOrder();
        System.out.println();

        x.root.inOrder();
        System.out.println();

        System.out.println("3)");
        x.root.verificaValor(7);
        System.out.println();

        System.out.println("4)");
        x.root.maiorValor();
        System.out.println();

        System.out.println("5)");
        x.root.menorValor();
        System.out.println();   

        System.out.println("6)");
        x.root.mediaArvore();
        System.out.println();        

        System.out.println("7)");
        x.root.numeroDeNulls(); 
        System.out.println();

        System.out.println("8)");
        x.root.numeroDeNos();
        System.out.println();

        System.out.println("9)");
        x.root.numeroDeFolhas();
        System.out.println();

        System.out.println("10)");
        x.root.altura();
        System.out.println();

    }


    static void adicionar_filhos(BinaryTreeNode no_left, BinaryTreeNode no_right, BinaryTreeNode no_pai) {
        no_pai.left = no_left;
        no_left.parent = no_pai;
        no_pai.right = no_right;
        no_right.parent = no_pai;
    }
}

