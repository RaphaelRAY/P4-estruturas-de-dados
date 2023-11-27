package C;

public class TestHash {
    
    
    public static void main(String[] args) {
        Integer[] tabKeys = new Integer[]{23, 45, 77, 11, 33, 49, 10, 4, 89, 14};
        Integer[] tabHash = new Integer[10]; 
        for (int i = 0; i < tabHash.length; i++) { 
            tabHash[i] = null; 
        }

        Integer hashCode = null, chave;



        for (int i = 0; i < tabKeys.length; i++) {
            chave = tabKeys[i];
            hashCode = hash(chave);
            System.out.println("Chave: " + chave + " HashCode: " + hashCode);
            if (tabHash[hashCode] == null) {
                tabHash[hashCode] = chave;
            } else {
                System.out.println("Colisão: " + chave + " com " + tabHash[hashCode]);
                Integer posicao = rehashing(tabHash, chave,i);
                if (posicao != null) {
                    tabHash[posicao] = chave;
                } else {
                    System.out.println("Tabela Hash cheia!");
                }
            }
        }	

        printHash(tabHash);
    }

    public static Integer hash(Integer key) {
        Integer hashCode = key % 10;
        return hashCode;

    }

    public static Integer rehashing(Integer[] tabHash, Integer key) {
        Integer hashCode = hash(key);
        if (tabHash[hashCode] == null) {
            return hashCode;
        } else {
            for (int i = 0; i < tabHash.length; i++) {
                if (tabHash[i] == null) {
                    System.out.println("Chave: " + key + " HashCode: " + i);
                    return i;
                }
            }
        }
        return null;
    }

    public static Integer rehashing(Integer[] tabHash, Integer key, Integer indice){
        for(int i = indice; i < tabHash.length; i++){
            if(tabHash[i] == null){
                System.out.println("Chave: " + key + " HashCode: " + i);
                return i;
            }
        }
        for(int i = 0; i < indice; i++){
            if(tabHash[i] == null){
                System.out.println("Chave: " + key + " HashCode: " + i);
                return i;
            }
        }
        return null;
    }
        
    
    public static void printHash(Integer[] tabHash) {
        System.out.println();
        System.out.println("Tabela Hash");
        System.out.println("------------------------------");
        for (int j = 0; j < tabHash.length; j++) {
            if (tabHash[j] != null) {
                System.out.println("Slot: " + j + " Chave: " + tabHash[j]);
            } else {
                System.out.println("Chave: " + j + " Nome: null");
            }
        }
    }
    
}

