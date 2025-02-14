package br.com.beecrowd.java.iniciante;

public class P1095 {
    public static void main(String[] args) {
        int i = 1;
        for (int j = 60; j >= 0; j--){
            if (j % 5 == 0 ){
                System.out.println("I="+i+" J="+j);
                i = i + 3;
            }


        }

    }
}
