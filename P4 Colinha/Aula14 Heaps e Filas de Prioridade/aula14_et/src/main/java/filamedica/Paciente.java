package filamedica;

public class Paciente {
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int prioridade;
    
    public int getPrioridade() {
        return prioridade;
    }

    private int idade;
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        verificar_prooridade();
    }

    private Boolean gestantes_puérperas;

    public Boolean getGestantes_puérperas() {
        return gestantes_puérperas;
    }

    public void setGestantes_puérperas(Boolean gestantes_puérperas) {
        this.gestantes_puérperas = gestantes_puérperas;
        verificar_prooridade();
    }

    public Paciente(String nome, int idade, Boolean gestantes_puérperas) {
        this.nome = nome;
        this.idade = idade;
        this.gestantes_puérperas = gestantes_puérperas;
        verificar_prooridade();
    }

    private void verificar_prooridade(){
        if (idade > 80) {
            this.prioridade = 0;
        } else if (idade > 60) {
            this.prioridade = 1;
        } else if (gestantes_puérperas) {
            this.prioridade = 2;
        } else {
            this.prioridade = 3;
        }
    }
    
}
