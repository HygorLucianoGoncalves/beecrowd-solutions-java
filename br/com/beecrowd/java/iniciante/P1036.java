package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, r1, r2;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        scanner.close();

        double delta = b * b - 4 * a * c;
        if (a == 0 || delta < 0) System.out.println("Impossivel calcular");
        else {
            r1 = (-(b) + Math.sqrt(delta)) /( 2 * a);
            r2 = (-(b) - Math.sqrt(delta)) /( 2 * a);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }
    }
}
