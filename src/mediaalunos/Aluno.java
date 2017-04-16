package mediaalunos;

public class Aluno {
    
    private String nome; // Nome do aluno
    private double nota1; // Nota da primeira avaliacao
    private double nota2; // Nota da segunda avaliacao
    private double media; // Media do aluno conforme UNIFACS
    
    public Aluno (String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        calculaMedia ();
    }
    
    public void calculaMedia () {
        media = nota1 * 0.3 + nota2 * 0.7;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }
    
}
