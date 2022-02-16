package com.company.segundoBimestre.lista04;

import java.util.Locale;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int compraTotal = 0;
        String vt = """
                Menu de opções:
                1-Realizar compra
                2- Encerrar o programa
                """;
        String cardapio = """
                Menu de opções:
                lasanha (R$ 8,00)
                estrogonofe (R$ 11,00)
                refrigerante (R$ 3,00)
                suco (R$ 2,50)
                """;
        System.out.println(vt);
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        while (opcao != 2) {
            System.out.println(cardapio);
            System.out.println("Informe a bebida escolhida");
            String cardapioCompraBebida = sc.next().toLowerCase();
            System.out.println("Informe a comida escolhida");
            String cardapioCompraComida = sc.next().toLowerCase();
            switch (cardapioCompraComida) {
                case "lasanha":
                    compraTotal += 8;
                    break;
                case "estrogonofe":
                    compraTotal += 11;
                    break;
                default:
                    System.out.println("opa! opcao errada.");
                    break;
            }
            switch (cardapioCompraBebida) {
                case "refrigerante":
                    compraTotal += 3;
                    break;
                case "suco":
                    compraTotal += 2.5;
                    break;
                default:
                    System.out.println("opa! opcao errada.");
                    break;
            }

            System.out.println(vt);
            opcao = sc.nextInt();
        }

        System.out.println("total a pagar: "+compraTotal);
    }
}
