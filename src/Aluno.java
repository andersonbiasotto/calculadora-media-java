// Classe responsável por representar um aluno e suas notas
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Calcula a média aritmética das três notas
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Retorna a situação do aluno de acordo com a média
    public String verificarSituacao() {
        double media = calcularMedia();

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Em recuperação";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }
}
