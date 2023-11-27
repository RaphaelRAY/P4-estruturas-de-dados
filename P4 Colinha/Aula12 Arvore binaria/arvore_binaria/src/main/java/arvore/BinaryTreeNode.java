package arvore;

public class BinaryTreeNode {
    public int item;
    public BinaryTreeNode parent;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int item) {
        this.item = item;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public BinaryTreeNode left() {
        if (this.left == null)
        return null;
        else return this.left ;
    }

    public boolean isLeft() {
        if (this.left == null)
        return false;
        else return true ;
    }
    public BinaryTreeNode right() {
        if (this.right == null)
        return null;
        else return this.right ;
    }
    public boolean isRight() {
        if (this.right == null)
        return false;
        else return true ;
    }
    public void preOrder() {
        System.out.println(this.item);
        if (this.isLeft())
            this.left.preOrder();
        if (this.isRight())
            this.right.preOrder();
    }
    
    public void postOrder() {
        if (this.isLeft())
            this.left.postOrder();
        if (this.isRight())
            this.right.postOrder();
            System.out.println(this.item);
    }

    public void inOrder() {
        if (this.isLeft())
            this.left.inOrder();
            System.out.println(this.item);
        if (this.isRight())
            this.right.inOrder();
    }

    public void verificaValor(int valor) {
        if (this.item == valor) {
            System.out.println("Valor encontrado na árvore!");
        } else {
            if (this.isLeft())
                this.left.verificaValor(valor);
            if (this.isRight())
                this.right.verificaValor(valor);
        }
        if(this.parent == null)
            System.out.println("Valor não encontrado na árvore!");
    }

    public void maiorValor() {
        int valor = item;
        if (this.isLeft())
            valor = this.left.maiorvalor(valor);
        if (this.isRight())
            valor = this.right.maiorvalor(valor);
        if(this.parent == null)
            System.out.println("Maior valor da árvore: " + valor);
    }

    private int maiorvalor(int n) {
        if (item>n)
            n = item;
        if (this.isLeft())
            n = this.left.maiorvalor(n);
        if (this.isRight())
            n = this.right.maiorvalor(n);
        return n;
    }

    public void menorValor() {
        int valor = item;
        if (this.isLeft())
            valor = this.left.menorvalor(valor);
        if (this.isRight())
            valor = this.right.menorvalor(valor);
        if(this.parent == null)
            System.out.println("Menor valor da árvore: " + valor);
    }

    private int menorvalor(int n) {
        if (item<n)
            n = item;
        if (this.isLeft())
            n = this.left.menorvalor(n);
        if (this.isRight())
            n = this.right.menorvalor(n);
        return n;
    }

    public void mediaArvore() {
        int[] m = {item,1,0};
        if (this.isLeft())
            this.left.contagem(m);
        if (this.isRight())
            this.right.contagem(m);
        System.out.printf("A média é: %.2f\n" , (double) m[0]/m[1]);
    }

    private void contagem(int[] m) {
        m[0] += item;
        m[1]++;
        if (this.isLeft())
            this.left.contagem(m);
        if (this.isRight())
            this.right.contagem(m);
        if (!this.isLeft() && !this.isRight())
            m[2]++;
    }

    public void numeroDeNos() {
        int[] m = {item,1,0};
        if (this.isLeft())
            this.left.contagem(m);
        if (this.isRight())
            this.right.contagem(m);
        System.out.printf("O n° total de nós é %d\n" , m[1]);
    }
    
    public void numeroDeFolhas() {
        int[] m = {item,1,0};
        if (this.isLeft())
            this.left.contagem(m);
        if (this.isRight())
            this.right.contagem(m);
        System.out.printf("O n° total de folhas é %d\n" , m[2]);
    }

    public void altura(){
        int altura = 0;
        int altura1=0, altura2=0;

        if (this.isLeft())
            altura1 = this.left.altura(altura+1);
        if (this.isRight())
            altura2 = this.right.altura(altura+1);
        if (altura2>altura1)
            altura1 = altura2;
        System.out.printf("A altura da árvore é: %d\n" , altura1);
    }
    
    private int altura(int altura) {
        int altura1 = altura, altura2 = altura;
        if (this.isLeft())
            altura1 = this.left.altura(altura+1);
        if (this.isRight())
            altura2 = this.right.altura(altura+1);
        if (altura2>altura1)
            altura1 = altura2;
        return altura1;
    }
    
    public void numeroDeNulls() {
        int[] m = {item,1,0};
        if (this.isLeft())
            this.left.contagem(m);
        if (this.isRight())
            this.right.contagem(m);
        System.out.printf("O n° total de NULLS é %d\n" , m[1]+1);
    }
}