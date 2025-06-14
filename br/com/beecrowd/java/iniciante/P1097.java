package br.com.beecrowd.java.iniciante;

public class P1097 {
    public static void main(String[] args) {
        int a = 1;
        int j1 = 7;
        int j2 = 6;
        int j3 = 5;
        for (int i =0; i <=4; i++){
            System.out.println("I="+a+" J="+j1);
            System.out.println("I="+a+" J="+j2);
            System.out.println("I="+a+" J="+j3);
            a += 2;
            j1 += 2;
            j2 += 2;
            j3 += 2;
        }
    }
}
