package main.java.com.company.revisao.parte1.lista03;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
       /* Escreva o menu de opções abaixo, leia a opção do usuário e execute a operação
escolhida. Escreva uma mensagem de erro se a opção for inválida.
escolha a opcao:
1- soma de 2 numeros
2- diferenca entre 2 numeros
3- divisao entre 2 numeros
4- produto entre dois numeros
*/
        String opcao = """
                escolha a opcao:
                1- soma de 2 numeros
                2- diferenca entre 2 numeros
                3- divisao entre 2 numeros
                4- produto entre dois numeros
                """;
        Scanner sc = new Scanner(System.in);
        System.out.println(opcao);
        int escolha = sc.nextInt();
        while (escolha != 0) {
            System.out.println(opcao);
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    int num1 = 2;
                    int num2 = 3;
                    num1 = num2 + num1;
                    System.out.println("opcao1:" + num1);
                    break;
                case 2:
                    int num3 = 2;
                    int num4 = 3;
                    num3 = num4 - num3;
                    System.out.println("opcao2:" + num3);
                    break;
                case 3:
                    int num5 = 2;
                    int num6 = 3;
                    num5 = num5 * num6;
                    System.out.println("opcao3:" + num5);
                    break;
                case 4:
                    int num7 = 2;
                    int num8 = 3;
                    num7 = num8 / num7;
                    System.out.println("opcao3:" + num7);
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }

        }

    }
}
