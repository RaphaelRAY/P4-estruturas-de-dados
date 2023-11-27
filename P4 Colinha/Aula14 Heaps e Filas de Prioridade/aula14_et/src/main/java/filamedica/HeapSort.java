package filamedica;

public class HeapSort {
    public static int tamanho;
    
    public static void maxHeapify(Paciente[] A, int pai){
        int left = 2 * pai + 1;
        int right = 2 * pai + 2;
        int maior = pai;

        if(left <= tamanho && A[left].getPrioridade() > A[maior].getPrioridade()){
            maior = left;
        }
        if(right <= tamanho && A[right].getPrioridade() > A[maior].getPrioridade()){
            maior = right;
        }
        if(maior != pai){
            Paciente aux = A[pai];
            A[pai] = A[maior];
            A[maior] = aux;
            maxHeapify(A, maior);
        }
    }

    public static void buildMaxHeap(Paciente[] A){
        tamanho = A.length - 1;
        for(int i = A.length/2; i >= 0; i--){
            maxHeapify(A, i);
        }
    }

    public static void heapSort(Paciente[] A){
        buildMaxHeap(A);

        for(int i = tamanho; i > 0; i--){
            Paciente aux = A[0];
            A[0] = A[i];
            A[i] = aux;
            tamanho--;
            maxHeapify(A, 0);
        }
    }
}
