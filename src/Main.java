import java.util.Scanner;

// Classe principal do programa
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Calculadora de Média Escolar ===");

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        double nota1 = lerNota(entrada, "Digite a primeira nota: ");
        double nota2 = lerNota(entrada, "Digite a segunda nota: ");
        double nota3 = lerNota(entrada, "Digite a terceira nota: ");

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        System.out.println("\n=== Resultado ===");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.printf("Média final: %.2f%n", aluno.calcularMedia());
        System.out.println("Situação: " + aluno.verificarSituacao());

        entrada.close();
    }

    // Método para garantir que a nota digitada esteja entre 0 e 10
    private static double lerNota(Scanner entrada, String mensagem) {
        double nota;

        while (true) {
            System.out.print(mensagem);
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                return nota;
            }

            System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
        }
    }
}
