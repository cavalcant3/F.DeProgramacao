package main.java.com.company.revisao.parte1.lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Escreva um programa que receba x segundos e como resultado apresente o tempo no
formato: horas:minutos:segundos (mesmo que algum dos campos seja zero. Ex: 2400s → 0:40:0 )*/
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe os segundos");
        float segundos = sc.nextFloat();
        DecimalFormat df = new DecimalFormat("##");
        float horas = segundos/3600;
        segundos %= 3600;
        float minutos = segundos/60;
        segundos %= 60;
        System.out.println(df.format(horas)+":"+df.format(minutos)+":"+df.format(segundos));
    }
}
