package br.com.beecrowd.iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
