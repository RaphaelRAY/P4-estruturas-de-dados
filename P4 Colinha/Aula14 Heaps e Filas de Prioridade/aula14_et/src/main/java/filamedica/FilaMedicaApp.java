package filamedica;

public class FilaMedicaApp {
    
    public static void main(String[] args) {
        Paciente p1 = new Paciente("João", 81, false);
        Paciente p2 = new Paciente("Maria", 61, false);
        Paciente p3 = new Paciente("José", 59, false);
        Paciente p4 = new Paciente("Ana", 59, true);
        Paciente p5 = new Paciente("Nicole", 81, false);

        FilaMedica fila = new FilaMedica(5);

        fila.inserir(p2);
        fila.inserir(p1);
        fila.inserir(p3);
        fila.inserir(p4);
        fila.inserir(p5);

        fila.imprimir();
        fila.ordenar();
        fila.imprimir();
    }
}

