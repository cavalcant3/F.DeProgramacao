package com.company.segundoBimestre.lista01;

import java.text.DecimalFormat;
import java.util.Scanner;
//Faça um programa em Java que calcule e apresente o valor do volume de uma lata de
//óleo, utilizando a fórmula VOLUME = pi * RAIO*2* ALTURA.
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do raio da lata ");
        double Raio = sc.nextDouble();
        System.out.println("Informe o valor da altura da lata ");
        double Altura = sc.nextDouble();

        double Volume = 3.14 * (Raio*2) * Altura;

        String PatternNumber = "###,##";
        DecimalFormat df = new DecimalFormat(PatternNumber);

        System.out.println("O volume é: " + df.format(Volume));
    }
}
