package br.com.beecrowd.java.iniciante;

import java.util.Scanner;
// Utilizando recursão com exemplo de Fatorial Simples
public class P1153 {
    private static int fact(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println(fact(x.nextInt()));
    }
}
