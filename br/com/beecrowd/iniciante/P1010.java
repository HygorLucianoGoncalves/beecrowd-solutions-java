package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigoDaPeca,numerosDePecas;
        double valorPorPeca,valorTotal,valorFinal;
        codigoDaPeca = teclado.nextInt();
        numerosDePecas = teclado.nextInt();
        valorPorPeca = teclado.nextDouble();
        valorTotal = valorPorPeca * numerosDePecas;
        codigoDaPeca = teclado.nextInt();
        numerosDePecas = teclado.nextInt();
        valorPorPeca = teclado.nextDouble();
        double valorTotal1 =  valorPorPeca * numerosDePecas;
        valorFinal =valorTotal1+ valorTotal;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorFinal);
        teclado.close();

    }
}
