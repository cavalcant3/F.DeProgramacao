package com.company.segundoBimestre.lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor gasto");
        double valorGasto = sc.nextDouble();
        double valorGorjeta = valorGasto * 0.1;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Esse é o valor da gorgeta: " +df.format(valorGorjeta));
        System.out.println("Esse é o valor total:" +df.format((valorGorjeta+valorGasto)));
    }
}
