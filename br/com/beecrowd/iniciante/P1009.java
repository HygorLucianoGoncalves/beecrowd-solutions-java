package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.next();
        double v1,v2,total;
        v1 = teclado.nextDouble();
        v2 = teclado.nextDouble();
        total = v1 + (v2*0.15);
        System.out.printf("TOTAL = %.2f\n",total);
//
    }
}
