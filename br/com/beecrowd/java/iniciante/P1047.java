package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1047 {
    public static void main(String[] args) {
        Scanner teaclado = new Scanner(System.in);

        int horaInicio = teaclado.nextInt();
        int minutoInicio = teaclado.nextInt();
        int horaFim = teaclado.nextInt();
        int minutoFim = teaclado.nextInt();

        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int fimEmMinutos = horaFim * 60 + minutoFim;

        if (fimEmMinutos < inicioEmMinutos) {
            fimEmMinutos += 24 * 60;
        }

        int duracaoEmMinutos = fimEmMinutos - inicioEmMinutos;

        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;

        if (horaInicio == horaFim && minutoInicio == minutoFim) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        }

    }
}
