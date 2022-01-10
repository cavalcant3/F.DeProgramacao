package com.company.segundoBimestre.lista01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a distancia inicial");
        double D1 = sc.nextDouble();
        System.out.println("Informe a distancia final");
        double D2 = sc.nextDouble();

        System.out.println("Informe a velocidade inicial");
        double VM = sc.nextDouble();
        double DF = D1 - D2;
        double TI = DF / VM;
//        convertendo velocidade para m/s
        VM = VM / 3.6;
        System.out.println("Velocidade em m/s" + VM);
        System.out.println("Tempo" + TI);

    }
}