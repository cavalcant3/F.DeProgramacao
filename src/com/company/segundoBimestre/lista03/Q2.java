package com.company.segundoBimestre.lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        System.out.println("Informe sua quantidade de diárias:");
        Scanner sc = new Scanner(System.in);
        double diarias = sc.nextInt();
//        notei que essa frase era muito repetitiva, então pensei como poderia ser a manutenção em um projeto.
//        fiz dessa forma para facilitar
        String informativo = "Valor total a ser pago: R$";

        String textblock = """
                Informe o tipo de apto. desejado:
                [1] – individual - R$ 125 
                [2] - Suíte dupla - R$ 140
                [3] - Suíte tripla - R$ 180
                """;
        System.out.println(textblock);
        int opcao = sc.nextInt();
        DecimalFormat df = new DecimalFormat("###");

        switch (opcao) {
//                [1] – individual - R$ 125
            case 1:
                double valorReal = diarias * 125;
                if (diarias >= 3) {

                    double desconto = valorReal * 0.15;
                    double valorDesconto = valorReal - desconto;

                    System.out.println(informativo + df.format(valorDesconto));
//                        valor sem desconto
                } else {
                    System.out.println(informativo + df.format(valorReal));
                }
                break;
//                    [2] - Suíte dupla - R$ 140
            case 2:
                double valorRealSDupla = diarias * 140;
                if (diarias >= 3) {

                    double desconto = valorRealSDupla * 0.15;
                    double valorDesconto = valorRealSDupla - desconto;

                    System.out.println(informativo + df.format(valorDesconto));
//                        valor sem desconto
                } else {
                    System.out.println(informativo + df.format(valorRealSDupla));
                }
                break;
//                    [3] - Suíte tripla - R$ 180
            case 3:
                double valorRealSTripla = diarias * 180;
                if (diarias >= 3) {

                    double desconto = valorRealSTripla * 0.15;
                    double valorDesconto = valorRealSTripla - desconto;

                    System.out.println(informativo + df.format(valorDesconto));
//                        valor sem desconto
                } else {
                    System.out.println(informativo + df.format(valorRealSTripla));
                }
                break;
            default:
                System.out.println("Opcao invalida");

        }

    }
}
