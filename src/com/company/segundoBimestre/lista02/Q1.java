package com.company.segundoBimestre.lista02;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Informe o número");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numeroInvertido = numeroInvertido(numero);
        System.out.println("O número invertido é:" +numeroInvertido);
    }

    public static int numeroInvertido(int numero) {
        boolean naoNegativo = numero < 0 ? true: false;
        if (naoNegativo){
            numero = numero * -1; //transformando em positivo para trabalharmos
        }
        int reverse = 0;
        int ultimoDigito;
        while (numero >= 1){
            ultimoDigito = numero % 10;
            reverse = reverse *10 + ultimoDigito;
            numero = numero / 10;
        }
        return naoNegativo == true? reverse *-1 : reverse;
    }
}
