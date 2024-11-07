package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String primeriaPalavra, segundaPalavra, terceiraPalavra;

        primeriaPalavra = scanner.next();
        segundaPalavra = scanner.next();
        terceiraPalavra = scanner.next();

        if (primeriaPalavra.equals("vertebrado")){
            if (segundaPalavra.equals("ave")){
                if (terceiraPalavra.equals("carnivoro")){
                    System.out.println("aguia");
                }else System.out.println("pomba");
            }else {
                if (terceiraPalavra.equals("onivoro")){
                    System.out.println("homem");
                }else System.out.println("vaca");
            }
        }

        if (primeriaPalavra.equals("invertebrado")){
            if (segundaPalavra.equals("inseto")){
                if (terceiraPalavra.equals("hematofago")){
                    System.out.println("pulga");
                }else System.out.println("lagarta");
            }else {
                if (terceiraPalavra.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else System.out.println("minhoca");
            }
        }


        scanner.close();
    }
}
