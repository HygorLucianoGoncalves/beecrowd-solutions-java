package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1065 {
    /*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        int valorTotalDePares = 0;

        for (int i = 0; i < 5; i++) {
            valores[i] = sc.nextInt();
            if (valores[i] % 2 == 0) {
                valorTotalDePares++;
            }
        }
        System.out.println(valorTotalDePares + " valores pares");
    }
}
