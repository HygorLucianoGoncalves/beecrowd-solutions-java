package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1046 {
    public static void main(String[] args) {
        Scanner teaclado = new Scanner(System.in);

        int horaQueComecou = teaclado.nextInt();
        int horaQueAcabou = teaclado.nextInt();

        if (horaQueComecou > horaQueAcabou){
            System.out.println("O JOGO DUROU " + (24 - (horaQueComecou - horaQueAcabou)) + " HORA(S)");
        }else if (horaQueAcabou > horaQueComecou) {
            System.out.println("O JOGO DUROU " + (horaQueAcabou - horaQueComecou) + " HORA(S)");
        }else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        teaclado.close();
    }
}
