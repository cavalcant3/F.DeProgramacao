package com.company.segundoBimestre.lista03;

import java.util.Scanner;

public class MiniTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o PSNR");

        int PSNR = sc.nextInt();
        if (PSNR < 0 || PSNR > 100) {
            System.out.println("Só é permitido valores entre 0 e 100");
        }

        System.out.println("Informe o enquadramento");
        String enquadramento = sc.next().toLowerCase();
        System.out.println("Informe a exposicao");
        String exposicao = sc.next().toLowerCase();

        while (PSNR > 0 && PSNR < 100) {
            if (enquadramento.equals("bom") && exposicao.equals("bemexposta")) {
                System.out.println("para imprimir");
                break;
            }
            if (enquadramento.equals("excelente") && exposicao.equals("subexposta")) {
                System.out.println("para imprimir");
                break;
            }
            if (enquadramento.equals("excelente") && exposicao.equals("superexposta")) {
                System.out.println("boa");
                break;
            } else {
                System.out.println("marromeno");
                break;
            }


        }
        while (PSNR < 50 && PSNR > 80) {
            if (enquadramento.equals("excelente") || exposicao.equals("bemexposta")) {
                System.out.println("boa");
                break;

            } else {
                System.out.println("marromeno");
                break;
            }

        }
        while (PSNR <= 49) {
            if (enquadramento.equals("excelente") && exposicao.equals("bemexposta")) {
                System.out.println("boa");
                        break;

            } else {
                System.out.println("lixo");
                break;
            }

        }

    }
}
