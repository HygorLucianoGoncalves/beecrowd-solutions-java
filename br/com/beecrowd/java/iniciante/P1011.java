package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double r = teclado.nextDouble();
        double pi = 3.14159;
        double valor = (4.0/3)*pi*Math.pow(r,3);
        System.out.printf("VOLUME = %.3f\n",valor);
    }
}
