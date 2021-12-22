package com.company.Lista01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
//       3672
        int horas = entrada / 3600;
        int resto = entrada % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;
        System.out.println(horas + ":" +minutos+ ":" +segundos);
    }
}
