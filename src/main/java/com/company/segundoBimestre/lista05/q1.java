package com.company.segundoBimestre.lista05;

import java.util.Scanner;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class q1 {
    public static void main(String[] args) {
        int qualidade = 0, preco = 0, prazo = 0, cont = 0, nota = 0,
                qualidadeNota = 0, precoNota = 0, prazoNota = 0;
        double geral[] = new double[5];
        Scanner sc = new Scanner(System.in);

        //if ()
        for (int i = 0; i <= 4; i++) {
            System.out.println("digite a nota da qualidade");
            qualidade = sc.nextInt();
            System.out.println("digite a nota do preço");
            preco = sc.nextInt();
            System.out.println("digite a nota da prazo");
            prazo = sc.nextInt();

            if (qualidade < 7) {
                System.out.println("nota 0");
                geral[i] = 0;

            } else if (qualidade >= 7 && preco >= 7) {

                geral[i] = (qualidade + prazo + preco) / 3;


            }
            if (qualidade >= 7 && preco < 7) {
                geral[i] = (qualidade + (2 * preco) + prazo) / 4;
            }

        }
        double max = geral[0];
        int inicio = 0;
        for (int i = 0; i < geral.length -1; i++) {
            if (geral[i]>max){
                max = geral[i];
                inicio = ArrayUtils.index
            }

        }
        System.out.println("nota geral qualidade" + qualidadeNota);
        System.out.println("nota geral preco " + precoNota);
        System.out.println("nota geral prazo " + prazoNota);
        if (qualidadeNota > precoNota && qualidadeNota > prazoNota) {
            System.out.println("Nota geral de qualidade ganhou, nota: " + qualidadeNota);
        }
        if (prazoNota > qualidadeNota && prazoNota > precoNota) {
            System.out.println("Nota geral de qualidade ganhou, nota: " + prazoNota);
        } else if (precoNota > qualidadeNota && precoNota > qualidadeNota) {
            System.out.println("Nota geral de qualidade ganhou, nota: " + precoNota);
        }

    }
}
