package com.company.segundoBimestre.lista04;

import java.util.Scanner;
/*Questão 01.Construa um programa que, para um grupo de 50 valores inteiros, determine:
a) A soma dos números positivos;
b) A quantidade de valores negativos*/
public class Q1 {
    public static void main(String[] args) {
        int i = 0;
        int Positivos = 0;
        int negativos = 0;
        while (i < 5) {
            System.out.println("Insira o valor a ser somado");
            Scanner sc = new Scanner(System.in);
            int somaPositivos = sc.nextInt();
            if (somaPositivos >= 0) {

                Positivos = Positivos + somaPositivos;
            } else {

                negativos++;

            }
            i++;
        }
        System.out.println("A soma de positivos é: " + Positivos);
        System.out.println("A quantidade de negativos é: " + negativos);
    }
}
