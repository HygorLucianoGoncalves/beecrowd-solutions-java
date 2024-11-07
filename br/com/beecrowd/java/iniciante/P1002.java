package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1002 {
    public static void main(String[] args) {
        Scanner taclado = new Scanner(System.in);
        double n = 3.14159;
        double raio,area;
        raio = taclado.nextDouble();
        area = n * (Math.pow(raio,2));
        System.out.printf("A=%.4f\n",area);

    }
}
