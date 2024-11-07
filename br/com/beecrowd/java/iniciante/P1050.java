package br.com.beecrowd.java.iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1050 {
    public static void main(String[] args) {
        // TEMPO 0.110s
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> listaDddComNomeDaCidade = new HashMap<>();

        listaDddComNomeDaCidade.put(61, "Brasilia");
        listaDddComNomeDaCidade.put(71, "Salvador");
        listaDddComNomeDaCidade.put(11, "Sao Paulo");
        listaDddComNomeDaCidade.put(21, "Rio de Janeiro");
        listaDddComNomeDaCidade.put(32, "Juiz de Fora");
        listaDddComNomeDaCidade.put(19, "Campinas");
        listaDddComNomeDaCidade.put(27, "Vitoria");
        listaDddComNomeDaCidade.put(31, "Belo Horizonte");

        int ddd = scanner.nextInt();

        String value = listaDddComNomeDaCidade.get(ddd);

        if (value != null) System.out.println(listaDddComNomeDaCidade.get(ddd));
        else System.out.println("DDD nao cadastrado");
    }
}
