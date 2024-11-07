package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1038 {
    public static void main(String[] args) {
        double [] arrayUm = {0,4,4.50,5,2,1.50};

        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        double soma = quantidade * arrayUm[codigo];

        System.out.printf("Total: R$ %.2f%n",soma);


        scanner.close();
    }
}
