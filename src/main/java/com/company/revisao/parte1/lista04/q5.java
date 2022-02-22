package main.java.com.company.revisao.parte1.lista04;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int idade=2;
        int somaIdade=0;
        double media =0;
        int contador=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            somaIdade += idade;
            contador++;
        }
        media = somaIdade/contador;
        System.out.println("soma "+somaIdade);
        System.out.println("media "+media);
    }
}
