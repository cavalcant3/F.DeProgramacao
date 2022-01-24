package com.company.segundoBimestre.lista03.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Informe o estado que deseja saber o imposto:");
        Scanner sc = new Scanner(System.in);
        String estados = sc.next();
        Q4Verificacao verificacao = new Q4Verificacao();
        verificacao.verificacao(estados);
        switch (estados) {
            case "MG":
                System.out.println("O valor é: 7%");
                break;
            case "SP":
                System.out.println("O valor é: 12%");
                break;
            case "RJ":
                System.out.println("O valor é: 15%");
                break;
            case "MS":
                System.out.println("O valor é: 8%");
                break;
        }


    }
}
