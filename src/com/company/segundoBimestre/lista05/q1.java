package com.company.segundoBimestre.lista05;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int qualidade = 0, preco = 0, prazo = 0, nota = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a nota da qualidade");
        qualidade = sc.nextInt();
        System.out.println("digite a nota do preço");
        preco = sc.nextInt();
        System.out.println("digite a nota da prazo");
        prazo = sc.nextInt();

        /*1. Se a nota da qualidade for inferior a 7, a nota geral será 0, independente dos outros fatores.

         2- Se a qualidade for igual ou superior a 7, e a nota do preço for igual ou superior a 7,
        então a nota será a média das três notas.

         3- Se a nota da qualidade for igual ou superior a 7 e a
         do preço for inferior a 7, então a nota geral será será (qualidade+2*preço+prazo)/4.*/
        while (qualidade <= 10 && preco <= 10 && prazo <= 10) {
            if (qualidade < 7) {
                System.out.println("nota 0");
                break;
            } else if (qualidade >= 7 && preco >= 7) {
                nota = (qualidade + prazo + preco) / 3;
                System.out.println("sua nota é: " + nota);
                break;
            }
            if (qualidade >= 7 && preco < 7) {
                nota = (qualidade + 2 * preco + prazo) / 4;
                System.out.println("sua nota é: " + nota);
                break;
            }


        }
    }
}
