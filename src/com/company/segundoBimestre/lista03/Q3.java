package com.company.segundoBimestre.lista03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String textblock = """
                dias disponiveis para diária:
                [1] - Domingo
                [2] – Segunda feira 
                [3] - terça feira
                [4] - quarta feira
                [5] - quinta feira
                [6] - sexta
                """;

        System.out.println(textblock);
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch (opcao){
            case 2:
                System.out.println("o valor da diária é R$: 400");
            break;
            case 3, 4, 5:
                System.out.println("o valor da diária é R$: 550");
                break;
            case 6:
                System.out.println("o valor da diária é R$: 600");
                break;
            case 1:
                System.out.println("o valor da diária é R$: 500");
                break;
            default:
                System.out.println("opção inválida");
        }
    }
}
