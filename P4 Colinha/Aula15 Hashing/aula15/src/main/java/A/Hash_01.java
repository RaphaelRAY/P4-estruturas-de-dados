package A;

public class Hash_01 {
    
    public static void main(String[] args) {
        Aluno[] tabAluno = new Aluno[10];
    
        tabAluno[0] = new Aluno(10, "João");
        tabAluno[1] = new Aluno(21, "Maria");
        tabAluno[2] = new Aluno(32, "José");
        tabAluno[3] = new Aluno(24, "Ana");
        tabAluno[4] = new Aluno(35, "Carlos");
        tabAluno[5] = new Aluno(60, "Marta");
        tabAluno[6] = new Aluno(44, "Paulo");
        tabAluno[7] = new Aluno(57, "Luiza");
        tabAluno[8] = new Aluno(80, "Pedro");
        tabAluno[9] = new Aluno(90, "Sandra");

        Integer hashCode = null, chave;
        Aluno[] tabHash = new Aluno[10];
        for (int i = 0; i < tabAluno.length; i++) {
            chave = tabAluno[i].getCodAluno();
            hashCode = hash(chave);
            System.out.println("Chave: " + chave + " HashCode: " + hashCode);
            
            if (tabHash[hashCode] == null) {
                tabHash[hashCode] = tabAluno[i];
            } else {
                System.out.println("Colisão: " + tabAluno[i].getNome() + " com " + tabHash[hashCode].getNome());
            }
        } 

        System.out.println();
        System.out.println("Tabela Aluno");
        System.out.println("------------------------------");
            for (int j = 0; j < tabAluno.length; j++) {
                if (tabAluno[j] != null) {
                    System.out.println("Chave: " + tabAluno[j].getCodAluno() + " Nome: " + tabAluno[j].getNome());
                } else {
                    System.out.println("Chave: " + j + " Nome: null");
                }
            }

            System.out.println();
            System.out.println("Tabela Hash");
            System.out.println("------------------------------");
            for (int j = 0; j < tabHash.length; j++) {
                if (tabHash[j] != null) {
                    System.out.println("Slot: " + j + " Chave: " + tabHash[j].getCodAluno() + " Nome: " + tabHash[j].getNome());
                } else {
                    System.out.println("Chave: " + j + " Nome: null");
                }
            }
    }

    
    public static Integer hash(Integer key) {
        return key % 10;
    }
    
    
}
