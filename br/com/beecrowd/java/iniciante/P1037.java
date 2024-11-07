package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double entrada = scanner.nextDouble();

        if (entrada < 0 || entrada > 100){
            System.out.println("Fora de intervalo");
        } else if (entrada > 0.25 && entrada <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (entrada > 25.00 && entrada <= 50.00){
            System.out.println("Intervalo (25,50)");
        } else if (entrada > 50.00 && entrada <= 75.00){
            System.out.println("Intervalo (50,75");
        } else {
            System.out.println("Intervalo (75,100)");
        }

        scanner.close();
    }
}
