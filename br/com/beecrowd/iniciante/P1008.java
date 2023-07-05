package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,quatidadeDeHoras;
        double recebePorHora,salario;
        numero = teclado.nextInt();
        quatidadeDeHoras = teclado.nextInt();
        recebePorHora = teclado.nextDouble();
        salario = recebePorHora * quatidadeDeHoras;
        System.out.println("NUMBER = "+numero);
        System.out.printf("SALARY = U$ %.2f\n",salario);

    }
}
