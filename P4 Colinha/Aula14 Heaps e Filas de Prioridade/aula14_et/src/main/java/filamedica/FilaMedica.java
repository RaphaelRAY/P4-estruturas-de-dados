package filamedica;

public class FilaMedica {
    public Paciente[] pacientes;
    public int tamanho;

    FilaMedica(int tamanho) {
        pacientes = new Paciente[tamanho];
        this.tamanho = 0;
    }
    
    public void inserir(Paciente paciente) {
        pacientes[tamanho] = paciente;
        tamanho++;
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(pacientes[i].getNome() + " " + pacientes[i].getPrioridade());
            
        }
        System.out.println();
    }

    public void ordenar() {
        HeapSort.heapSort(pacientes);
    }


}
