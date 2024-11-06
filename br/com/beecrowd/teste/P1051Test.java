package br.com.beecrowd.teste;

import java.util.Scanner;

public class P1051Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valorDoSalario = input.nextDouble();

        double out;

        if (valorDoSalario <= 2000.00) {
            System.out.println("Isento");
        } else if (valorDoSalario >= 2000.01 && valorDoSalario <= 3000.00) {
            double resto = valorDoSalario - 2000;
            out = resto * 0.08;
            System.out.printf("R$ %.2f", out);
        } else if (valorDoSalario >= 3001.00 && valorDoSalario <= 4500.00) {
            double resto = valorDoSalario - 3000;
            out = (resto * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f", out);
        } else {
            double resto = valorDoSalario - 4500;
            out = (resto * 0.28) + (1500 * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f", out);
        }

        input.close();
    }
}
