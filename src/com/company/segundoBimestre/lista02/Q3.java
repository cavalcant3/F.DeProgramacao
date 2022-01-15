package com.company.segundoBimestre.lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho da escada");
        double tamEscada = sc.nextDouble();
        System.out.println("Informe o tamanho a distância do quadro");
        double distQuadro = sc.nextDouble();
        double distFinal = Math.sqrt(Math.pow(tamEscada, 2) -
                (Math.pow(distQuadro,2)));
        DecimalFormat df = new DecimalFormat("##.#");
        System.out.println("A distância final que você tem que deixar é: " +df.format(distFinal)+ " m");


    }
}
