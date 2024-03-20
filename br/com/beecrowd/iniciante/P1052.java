package br.com.beecrowd.iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1052 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> listaMes = new HashMap<>();

        listaMes.put(1,"January");
        listaMes.put(2,"February");
        listaMes.put(3,"March");
        listaMes.put(4,"April");
        listaMes.put(5,"May");
        listaMes.put(6,"June");
        listaMes.put(7,"July");
        listaMes.put(8,"August");
        listaMes.put(9,"September");
        listaMes.put(10,"October");
        listaMes.put(11,"November");
        listaMes.put(12,"December");

        int numeroDoMes = scanner.nextInt();
        String mes = listaMes.get(numeroDoMes);
        System.out.println(mes);

        scanner.close();
    }
}
