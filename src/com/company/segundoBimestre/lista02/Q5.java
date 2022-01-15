package com.company.segundoBimestre.lista02;

import java.text.DecimalFormat;
import java.util.Scanner;
//velocidade média,
// tempo gasto na viagem, a
//distância percorrida e a
// quantidade de litros utilizada na viagem.
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tempo gasto na viagem");
        double timeLess = sc.nextDouble();
        System.out.println("Informe a velocidade média");
        double mediumVelocity = sc.nextDouble();
        double pcDeBordo = pcDeBordo(timeLess, mediumVelocity);
        System.out.println(pcDeBordo);
    }

    private static double pcDeBordo(double timeLess, double mediumVelocity) {
        double distance = mediumVelocity * timeLess;
        double litros = distance/11;
        DecimalFormat time = new DecimalFormat("##:##:##");
        DecimalFormat vel = new DecimalFormat("###,##");

        System.out.println("O tempo gasto é: " + time.format(timeLess));
        System.out.println("a velocidade média  é: " + vel.format(mediumVelocity)+"KM ");
        System.out.println("Os litros gastos é: " + vel.format(litros) + " L ");
        System.out.println("a distância  é: " + vel.format(distance));



        return 0;
    }
}
