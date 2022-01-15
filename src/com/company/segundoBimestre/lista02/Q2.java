package com.company.segundoBimestre.lista02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a altura em cm");
        double altura = sc.nextDouble();

        System.out.println("Informe a base em cm");
        double base = sc.nextDouble();

        double M2 = (altura/100) * (base/100);
        System.out.println("A sua casa tem: " +M2+ "metros quadrados");
        double QntWatts = M2 * 18;
        double QntLampadas = QntWatts / 18;
        
        System.out.println("A quantidade de Watts necessários é: " +QntWatts+ " Watts. E serão necessários: " +QntLampadas+ "lampadas");

    }
}
