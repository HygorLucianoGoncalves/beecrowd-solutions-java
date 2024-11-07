package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1044 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a,b;
        a = teclado.nextInt();
        b = teclado.nextInt();

        boolean saoMultiplos = b % a == 0 || a % b == 0;

        if (saoMultiplos) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }
}
