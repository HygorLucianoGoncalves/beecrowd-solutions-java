package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1066 {
    /*
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares,
quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valoresPares = 0, valoresImpares = 0, valoresPositivos = 0, valoresNegativos = 0;
        int[] valores = new int[5];

        for (int i = 0; i < 5; i++) {
            valores[i] = sc.nextInt();

            if (valores[i] > 0) {
                valoresPositivos++;
            } else if (valores[i] < 0) {
                valoresNegativos++;
            }
            if (valores[i] % 2 == 0) {
                valoresPares++;
            } else
                valoresImpares++;
        }

        System.out.println(valoresPares + " valor(es) par(es)");
        System.out.println(valoresImpares + " valor(es) impar(es)");
        System.out.println(valoresPositivos + " valor(es) positivo(s)");
        System.out.println(valoresNegativos + " valor(es) negativo(s)");


    }
}
