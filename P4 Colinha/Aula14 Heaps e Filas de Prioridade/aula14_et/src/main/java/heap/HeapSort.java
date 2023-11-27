package heap;

public class HeapSort {
    public static int tamanho;
    
    public static void maxHeapify(int[] A, int pai){
        int left = 2 * pai + 1;
        int right = 2 * pai + 2;
        int maior = pai;

        if(left <= tamanho && A[left] > A[maior]){
            maior = left;
        }
        if(right <= tamanho && A[right] > A[maior]){
            maior = right;
        }
        if(maior != pai){
            int aux = A[pai];
            A[pai] = A[maior];
            A[maior] = aux;
            maxHeapify(A, maior);
        }
    }

    public static void buildMaxHeap(int[] A){
        tamanho = A.length - 1;
        for(int i = A.length/2; i >= 0; i--){
            maxHeapify(A, i);
        }
    }

    public static void heapSort(int[] A){
        buildMaxHeap(A);
        for(int i = tamanho; i > 0; i--){
            int aux = A[0];
            A[0] = A[i];
            A[i] = aux;
            tamanho--;
            maxHeapify(A, 0);
        }
    }

    public static void main(String[] args) {
        int[] A = {5, 2, 4, 6, 1, 3};
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        heapSort(A);
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
}
