package com.company.segundoBimestre.lista04;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int consultaSaldo, saque = 0, deposito = 0;
        String vt = """
                Menu de opções:
                (1) consulta saldo
                (2) saque
                (3) depósito
                (4) sair.
                """;
        System.out.println(vt);
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        while (opcao != 4 || saque > deposito) {
            switch (opcao) {
                case 1:
                    System.out.println("O saldo disponivel é:" + deposito);
                    break;
                case 2:
                    System.out.println("Quanto você quer sacar?");
                    int querSacar = sc.nextInt();
                    if (querSacar > deposito) {
                        System.out.println("Não é possivel. Saque maior que deposito");
                    } else {
                        deposito = deposito - querSacar;
                        System.out.println("Você sacou: " + querSacar + " Resta: " + deposito);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor para deposito: ");
                    deposito = sc.nextInt();
                    break;
            }
            System.out.println(vt);
            opcao = sc.nextInt();
        }
    }
}
