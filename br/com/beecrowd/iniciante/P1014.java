package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        double y,total;
        x = teclado.nextInt();
        y = teclado.nextDouble();
        total = x/y;
        System.out.printf("%.3f km/l",total);
    }
}
