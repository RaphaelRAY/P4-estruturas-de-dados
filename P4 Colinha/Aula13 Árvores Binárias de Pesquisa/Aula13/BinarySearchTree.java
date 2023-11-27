public class BinarySearchTree{
    SearchTreeNode root;
    int size;
    public BinarySearchTree(){
        this.root = null;
        this.size = 0;
    }

    public void insert_root(SearchTreeNode node) {
        this.root = node;
        this.size = 1;
    }

    public SearchTreeNode ret_Root() {
        return (this.root);
    }

    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        if (this.size == 0 )
        return true;
        else return false;
    }
    public void addNode(int chave, String nome){
        SearchTreeNode newNode = new SearchTreeNode(chave, nome);
        if (this.root == null ){
            this.insert_root(newNode);
        }
        else{
            SearchTreeNode nodeTrab = this.root;
            while(true){
                if (chave < nodeTrab.key){
                    if(nodeTrab.left == null){
                        nodeTrab.left = newNode;
                        newNode.parent = nodeTrab;
                        newNode.nome = nome;
                        this.size++;
                        return;
                    }
                    else{
                        nodeTrab = nodeTrab.left;
                    }
                }
                else{
                    if(nodeTrab.right == null){
                        nodeTrab.right = newNode;
                        newNode.parent = nodeTrab;
                        newNode.nome = nome;
                        this.size++;
                        return;
                    }
                    else{
                        nodeTrab = nodeTrab.right;
                    }
                }
            }
        }

    }

    SearchTreeNode buscaChave (int key){
        SearchTreeNode noTrab = this.root;
        while(noTrab != null && noTrab.key != key){
            if (key < noTrab.key)
                noTrab = noTrab.left;
            else
                noTrab = noTrab.right;
        }
        if (noTrab != null)
            System.out.println("Valor encontrado");
        else
            System.out.println("Valor não encontrado");
        return noTrab;
    }

    SearchTreeNode buscaMenor (){
        SearchTreeNode noTrab = this.root;
        while(noTrab.left != null){
            noTrab = noTrab.left;
        }
        return noTrab;
    }

    public int QuantidaDeDos(){
        if (root == null)
            return 0;
        else
            return 1 + quantidadenos(root.left) + quantidadenos(root.right);
    }

    private int quantidadenos(SearchTreeNode no){
        if (no == null)
            return 0;
        else
            return 1 + quantidadenos(no.left) + quantidadenos(no.right);
    }
}