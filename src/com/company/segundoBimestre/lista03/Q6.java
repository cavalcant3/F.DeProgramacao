package com.company.segundoBimestre.lista03;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Qual crime foi cometido");
        Scanner sc = new Scanner(System.in);
        String resposta = sc.next();
        System.out.println("Qual crime foi cometido");
        String crimeDelatado = sc.next();

        if (resposta == "roubo" || resposta == "trafico" && crimeDelatado == "homicidio") {
            System.out.println("Delação concedida.");
        } else if (resposta == "roubo" && crimeDelatado == "roubo") {
            System.out.println("O valor do roubo delatado é quantas vezes maior? Ex: 5");
            int  verificacao = sc.nextInt();
            var result = (verificacao >= 5) ? "Delação concedida." : "Delação rejeitada.";
            System.out.println(result);
        } else if (resposta == "roubo" && crimeDelatado == "trafico") {
            System.out.println("O valor da droga traficada é quantas vezes maior? Ex: 3");
            int verificacao = sc.nextInt();
            var result = (verificacao >= 3) ? "Delação concedida." : "Delação rejeitada.";
            System.out.println(result);
        } else if (resposta == "trafico" && crimeDelatado == "trafico") {
            System.out.println("O valor da droga traficada é quantas vezes maior o seu? Ex: 5");
            int verificacao = sc.nextInt();
            var result = (verificacao >= 5) ? "Delação concedida." : "Delação rejeitada.";
            System.out.println(result);
        } else if (resposta == "homicidio" && crimeDelatado == "homicidio") {
            System.out.println("Delação concedida.");
        }

    }
}
