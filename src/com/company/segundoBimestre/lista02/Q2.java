package com.company.segundoBimestre.lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a altura em cm");
        double altura = sc.nextDouble();

        System.out.println("Informe a base em cm");
        double base = sc.nextDouble();

        double metrosQuadr = (altura/100) * (base/100);
        System.out.println("A sua casa tem: " +metrosQuadr+ "metros quadrados");
        double qntWatts = metrosQuadr * 18;
        double qntLampadas = qntWatts / 18;
        DecimalFormat df = new DecimalFormat("###.#");

        System.out.println("A quantidade de Watts necessários é: " +df.format(qntWatts)+
                " Watts. E serão necessários: " +df.format(qntLampadas)+ " lampadas");

    }
}
