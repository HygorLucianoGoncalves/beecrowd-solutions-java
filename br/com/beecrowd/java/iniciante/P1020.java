package br.com.beecrowd.java.iniciante;

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

        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dia+" dia(s)");
    }
}
