package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P1020 {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        int valor,ano,mes,dia;
        valor = teclado.nextInt();
        
        ano = valor/365;
        valor = valor%365;
        mes = valor/30;
        dia = valor%30;

        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);
    }
}
