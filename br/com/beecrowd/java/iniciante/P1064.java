package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

/*

Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a
 média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.
 */
public class P1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double[] valores = new Double[6];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextDouble();
        }

        int valoresInt = 0;
        double media = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] >= 0) {
                media += valores[i];
                valoresInt++;
            }
        }
        System.out.println(valoresInt + " valores positivos");
        System.out.printf("%.1f\n", media / valoresInt);
    }
}
