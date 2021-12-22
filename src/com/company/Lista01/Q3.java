package com.company.Lista01;

import java.util.Scanner;

import static java.lang.String.format;

public class Q3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        float premio = 52000000;
        float candidato1 = (float) (premio / 0.45);
        float candidato2 = (float) (premio / 0.35);
        float candidato3= (float) (premio / 0.20);
        System.out.printf("candidato 1: ", candidato1, "%.2f");
        System.out.printf("%.2f", candidato2);
        System.out.printf("%.2f", candidato3);


    }
}
