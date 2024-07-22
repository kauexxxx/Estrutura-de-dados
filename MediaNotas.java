import java.util.Scanner;

class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
            input.nextLine();
            soma += notas[i];
        }

        double media = soma / 5;
        System.out.println("A média das notas da turma é: " + media);
        System.out.println("Alunos com nota superior à média:");
        for (int i = 0; i < 5; i++) {
            if (notas[i] > media) {
                System.out.println(nomes[i] + " - Nota: " + notas[i]);
            }
        }

        System.out.println("Conceitos dos alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.print(nomes[i] + ": ");
            if (notas[i] >= 0 && notas[i] < 4) {
                System.out.println("Nota E");
            } else if (notas[i] >= 4 && notas[i] < 5) {
                System.out.println("Nota D");
            } else if (notas[i] >= 5 && notas[i] < 7) {
                System.out.println("Nota C");
            } else if (notas[i] >= 7 && notas[i] < 8) {
                System.out.println("Nota B");
            } else if (notas[i] >= 8 && notas[i] <= 10) {
                System.out.println("Nota A");
            }
        }
    }
}
