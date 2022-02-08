package com.company.segundoBimestre.lista04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int maiorNumero = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Informe um número:");
            n = sc.nextInt();
            if (n > maiorNumero) {
                maiorNumero = n;
            }

        }
        while (n != 0);
        System.out.println("O maior número foi: "+maiorNumero);

    }
}
