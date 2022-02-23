package main.java.com.company.revisao.parte1.lista06;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        /*Um edital de concorrência pública avaliará 5 propostas considerando três critérios:
         qualidade, preço e prazo. Cada um dos três recebe uma nota de zero a dez.
         Escreva um programa que leia as notas de preço, prazo e qualidade de cada proposta
         e escreva a nota geral de cada proposta bem como qual das propostas apresentadas
         ganhou a concorrência (obteve maior nota). Para calcular as notas deve-se utilizar os seguintes critérios:

         1. Se a nota da qualidade for inferior a 7, a nota geral será 0,
         independente dos outros fatores.
         2- Se a qualidade for igual ou superior a 7,
         e a nota do preço for igual ou superior a 7, então a nota será a média das três notas.
         3- Se a nota da qualidade for igual ou superior a 7 e a do preço for inferior a 7,
         então a nota geral será será (qualidade+2*preço+prazo)/4.*/

        double notaMaior = 0, preco = 0, prazo = 0, qualidade = 0, notaGeral = 0, mediaNota = 0;
        int vencedor = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("digite o preço da proposta: " + i);
            preco = sc.nextDouble();
            System.out.println("digite o prazo da proposta: " + i);
            prazo = sc.nextDouble();
            System.out.println("digite o qualidade da proposta: " + i);
            qualidade = sc.nextDouble();
            if (qualidade < 7) {
                notaGeral = 0;
            } else if ((qualidade >= 7) && (preco >= 7)) {
                notaGeral = mediaNota = (qualidade + preco + prazo) / 3;
            } else if ((qualidade >= 7) && (preco < 7)) {
                notaGeral = (qualidade + 2 * preco + prazo) / 4;
            }
            if (notaGeral > notaMaior) {
                notaMaior = notaGeral;
                vencedor = i;
            }
        }
        System.out.println("Vencedor proposta n°: " + vencedor);
        System.out.println("nota: " + notaMaior);
    }
}
