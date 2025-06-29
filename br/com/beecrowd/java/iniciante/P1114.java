package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int senha = sc.nextInt();
            if (senha == 2002){
                System.out.println("Acesso Permitido");
                break;
            }else System.out.println("Senha Invalida");

        }
    }
}
