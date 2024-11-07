package br.com.beecrowd.java.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");
        double N1, N2, N3, N4;

        N1 = scanner.nextDouble();
        N2 = scanner.nextDouble();
        N3 = scanner.nextDouble();
        N4 = scanner.nextDouble();

        double soma = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / (2 + 3 + 4 + 1);

        System.out.println("Media: " + df.format(soma));

        if (soma > 6.9) {
            System.out.println("Aluno aprovado.");
        } else if (soma >= 5 && soma < 6.9) {
            System.out.println("Aluno em exame.");
            double teste = scanner.nextDouble();
            System.out.println("Nota do exame: " + teste);
            soma = (soma + teste) / 2;
            if (soma >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(soma));
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}
