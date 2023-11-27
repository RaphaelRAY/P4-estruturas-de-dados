import java.util.LinkedList;

public class SearchTreeNode {
    int key;
    SearchTreeNode parent;
    SearchTreeNode left;
    SearchTreeNode right;
    String nome;

    public SearchTreeNode(int key, String nome) {
        this.key = key;
        this.nome = nome;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public SearchTreeNode left() {
        if (this.left == null)
            return null;
        else
            return this.left ;
    }

    public boolean hasLeft() {
        if (this.left == null)
            return false;
        else
            return true ;
    }
    public SearchTreeNode right() {
        if (this.right == null)
            return null;
        else
            return this.right ;
    }
    public boolean hasRight() {
        if (this.right == null)
            return false;
        else
            return true ;
    }
    public void preOrder() {
        System.out.println(this.key);
        if (this.hasLeft())
            this.left.preOrder();
        if (this.hasRight())
            this.right.preOrder();
    }
    
    public void postOrder() {
        if (this.hasLeft())
            this.left.postOrder();
        if (this.hasRight())
            this.right.postOrder();
        System.out.println(this.key);
    }

    public void inOrder() {
        if (this.hasLeft())
            this.left.inOrder();
        System.out.println(this.key);
        if (this.hasRight())
            this.right.inOrder();
    }

    public void verificaValor(int valor) {
        if (this.key == valor) {
            System.out.println("Valor encontrado na árvore!");
        } else {
            if (this.hasLeft())
                this.left.verificaValor(valor);
            if (this.hasRight())
                this.right.verificaValor(valor);
        }
        if(this.parent == null)
            System.out.println("Valor não encontrado na árvore!");
    }

    public void maiorValor() {
        int valor = key;
        if (this.hasLeft())
            valor = this.left.maiorvalor(valor);
        if (this.hasRight())
            valor = this.right.maiorvalor(valor);
        if(this.parent == null)
            System.out.println("Maior valor da árvore: " + valor);
    }

    private int maiorvalor(int n) {
        if (key>n)
            n = key;
        if (this.hasLeft())
            n = this.left.maiorvalor(n);
        if (this.hasRight())
            n = this.right.maiorvalor(n);
        return n;
    }

    public void menorValor() {
        int valor = key;
        if (this.hasLeft())
            valor = this.left.menorvalor(valor);
        if (this.hasRight())
            valor = this.right.menorvalor(valor);
        if(this.parent == null)
            System.out.println("Menor valor da árvore: " + valor);
    }

    private int menorvalor(int n) {
        if (key<n)
            n = key;
        if (this.hasLeft())
            n = this.left.menorvalor(n);
        if (this.hasRight())
            n = this.right.menorvalor(n);
        return n;
    }

    public double mediaArvore() {
        int[] m = {key,1,0};
        if (this.hasLeft())
            this.left.contagem(m);
        if (this.hasRight())
            this.right.contagem(m);
        double media = (double) m[0]/m[1];
        System.out.printf("A média é: %.2f\n" , media);
        return media;
    }

    private void contagem(int[] m) {
        m[0] += key;
        m[1]++;
        if (this.hasLeft())
            this.left.contagem(m);
        if (this.hasRight())
            this.right.contagem(m);
        if (!this.hasLeft() && !this.hasRight())
            m[2]++;
    }

    public void numeroDeNos() {
        int[] m = {key,1,0};
        if (this.hasLeft())
            this.left.contagem(m);
        if (this.hasRight())
            this.right.contagem(m);
        System.out.printf("O n° total de nós é %d\n" , m[1]);
    }
    
    public void numeroDeFolhas() {
        int[] m = {key,1,0};
        if (this.hasLeft())
            this.left.contagem(m);
        if (this.hasRight())
            this.right.contagem(m);
        System.out.printf("O n° total de folhas é %d\n" , m[2]);
    }

    public void altura(){
        int altura = 0;
        int altura1=0, altura2=0;

        if (this.hasLeft())
            altura1 = this.left.altura(altura+1);
        if (this.hasRight())
            altura2 = this.right.altura(altura+1);
        if (altura2>altura1)
            altura1 = altura2;
        System.out.printf("A altura da árvore é: %d\n" , altura1);
    }
    
    private int altura(int altura) {
        int altura1 = altura, altura2 = altura;
        if (this.hasLeft())
            altura1 = this.left.altura(altura+1);
        if (this.hasRight())
            altura2 = this.right.altura(altura+1);
        if (altura2>altura1)
            altura1 = altura2;
        return altura1;
    }
    
    public void numeroDeNulls() {
        int[] m = {key,1,0};
        if (this.hasLeft())
            this.left.contagem(m);
        if (this.hasRight())
            this.right.contagem(m);
        System.out.printf("O n° total de NULLS é %d\n" , m[1]+1);
    }

    public LinkedList<Integer> multiplosDeDois (){
        LinkedList<Integer> lista = new LinkedList<Integer>();
        if (this.key%2 == 0)
            lista.add(this.key);
        if (this.hasLeft())
            lista.addAll(this.left.multiplosDeDois());
        if (this.hasRight())
            lista.addAll(this.right.multiplosDeDois());

        return lista;
    }
    
    public double soma() {
        int[] m = {key,1,0};
        if (this.hasLeft())
            this.left.contagem(m);
        if (this.hasRight())
            this.right.contagem(m);
        int soma = m[0];
        System.out.printf("A soma dos elementos é: %d\n" , soma);
        return soma;
    }
}