package br.com.beecrowd.java.iniciante;
import java.util.Scanner;

public class P1052 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println(monthString);
        scanner.close();
    }
}
//Map<Integer, String> listaMes = new HashMap<>();
//
//        listaMes.put(1,"January");
//        listaMes.put(2,"February");
//        listaMes.put(3,"March");
//        listaMes.put(4,"April");
//        listaMes.put(5,"May");
//        listaMes.put(6,"June");
//        listaMes.put(7,"July");
//        listaMes.put(8,"August");
//        listaMes.put(9,"September");
//        listaMes.put(10,"October");
//        listaMes.put(11,"November");
//        listaMes.put(12,"December");