package B;

public class TestHash {
    public static void main(String[] args) {
        Integer[] tabKeys = new Integer[100000]; 
        for (int i = 1; i <= tabKeys.length-1; i++) { 
            tabKeys[i] = i + 1; 
        }

        SList[] tabHash = new SList[1000];
        for (int i = 0; i < tabHash.length; i++) {
            tabHash[i] = new SList(); 
        }

        Integer hashCode = null, chave;
        for (int i = 1; i <= tabKeys.length-1; i++) {
            chave = tabKeys[i];
            hashCode = hash(chave);
            System.out.println("Chave: " + chave + " HashCode: " + hashCode);
            tabHash[hashCode].insert(chave);
        }

        System.out.println();
        System.out.println("Tabela Hash");

        System.out.println("------------------------------");
        for (int j = 0; j < tabHash.length; j++) {
            System.out.print("Slot " + j + ": ");
            tabHash[j].printList();
            System.out.println();
        }

        System.out.println();


    }

    public static Integer hash(Integer key) {
        return (key % 1000);
    }
}

