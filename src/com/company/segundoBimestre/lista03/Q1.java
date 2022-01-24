package com.company.segundoBimestre.lista03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String textblock = """
                Informe a opcao desejada:
                [1] – Ordem crescente 
                [2] -Ordem decrescente.
                """;
        System.out.println(textblock);
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();

        if (opcao == 1 || opcao == 2) {
            System.out.println("Informe dois números:");
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            switch (opcao) {
                case 1:
                    if (numero1 < numero2) {
                        System.out.println("Imprimindo em ordem crescente");
                        System.out.println("Esse é o numéro 1:" + numero1);
                        System.out.println("Esse é o numéro 2:" + numero2);
                    } else if (numero1 > numero2) {
                        System.out.println("Imprimindo em ordem crescente");
                        System.out.println("Esse é o numéro 2:" + numero2);
                        System.out.println("Esse é o numéro 1:" + numero1);
                    }
                    break;
                case 2:
                    if (numero1 > numero2) {
                        System.out.println("Imprimindo em ordem decrescente");
                        System.out.println("Esse é o numéro 1:" + numero1);
                        System.out.println("Esse é o numéro 2:" + numero2);
                    } else if (numero1 < numero2) {
                        System.out.println("Imprimindo em ordem decrescente");
                        System.out.println("Esse é o numéro 2:" + numero2);
                        System.out.println("Esse é o numéro 1:" + numero1);
                    }
                    break;
            }
        } else {
            System.out.println("Opção inválida");
        }


    }
}
