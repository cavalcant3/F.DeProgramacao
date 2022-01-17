package com.company.segundoBimestre.lista02;

import java.util.Scanner;

public class provaQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de edeficações: ");
        int edficacoes = sc.nextInt();
        System.out.println("Informe o número de edeficações: ");
        double valorAgua = sc.nextDouble();

        double consumoResidencial = 0;
        double consumoComercial = 0;
        double consumoIndustrial = 0;

        for (int i = 0; i <= edficacoes; i++) {
            System.out.println("informe sua categoria");
            System.out.println("1 - residencial");
            System.out.println("2 - comercial");
            System.out.println("3 - industrial");
            int categoria = sc.nextInt();
            if (categoria == 1 ){
                System.out.println("Informe o consumo de agua");
                 consumoResidencial = sc.nextDouble();
            }
            if (categoria == 2) {
                System.out.println("Informe o consumo de agua");
                 consumoComercial = sc.nextDouble();
            } else {
                System.out.println("Informe o consumo de agua");
                 consumoIndustrial = sc.nextDouble();
            }

            double taxaEsgoto = (consumoComercial + consumoIndustrial + consumoResidencial) * 0.2;
            double mediaDeConsumo = (consumoComercial + consumoIndustrial + consumoResidencial)/4;
            System.out.println("A taxa de esgoto é: " + taxaEsgoto);
            System.out.println("A média de consumo é: " + mediaDeConsumo);
            System.out.println("O total de consumo da cetegoria 1 é: " + consumoResidencial);
            System.out.println("O total de consumo da cetegoria 2 é: " + consumoComercial);
            System.out.println("O total de consumo da cetegoria 3 é: " + consumoIndustrial);


        }


    }
}
