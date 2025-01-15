package br.com.beecrowd.java.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class P1074 {
    /*
    Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é
    par (EVEN),
   ímpar (ODD),
   positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja
   NULL
   (EVEN NULL), pois por definição zero é par,
     seu programa deverá imprimir apenas .

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.

Exemplo de Entrada	Exemplo de Saída
4
-5
0
3
-4

ODD NEGATIVE
NULL
ODD POSITIVE
EVEN NEGATIVE
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n+1];
        for (int j = 1; j <= n; j++) {
            x[j] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {

            if (x[i] > 0 && x[i] % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            } else if (x[i] < 0 && x[i] % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (x[i] > 0 && x[i] % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } else if (x[i] < 0 && x[i] % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            } else System.out.println("NULL");


        }


    }
}
