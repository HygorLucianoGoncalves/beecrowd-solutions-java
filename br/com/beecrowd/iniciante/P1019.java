package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class P1019 {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        int horas = valor/3600;
        valor = valor%3600;
        int minutos = valor/60;
        valor = valor%60;
        int segundos = valor;
        System.out.println(horas + ":" +minutos +":"+segundos);
    }
}
