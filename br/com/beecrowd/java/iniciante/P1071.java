package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1071 {
    public static void main(String[] args) {

        /*
          no if - pegamos os valor do menor para o maior.
          faz o FOR enquanto i < valor...
          colocando o (+ 1) no i para pode calcular o  valor fornecido.
         */

        Scanner sc = new Scanner(System.in);

        int valorOne;
        int valorTwo;
        int sum = 0;

        valorOne = sc.nextInt();
        valorTwo = sc.nextInt();


        if (valorOne < valorTwo) {
            for (int i = valorOne + 1; i < valorTwo; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = valorTwo + 1; i < valorOne; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);


        sc.close();

    }
}
