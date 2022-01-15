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
        int reverse = 0; // o java solicita inicilaizar essa vriável
        int ultimoDigito;
        while (numero >= 1){
            ultimoDigito = numero % 10; //se o  numero for maior ou igual a 1 nós calculamos o resto e atribuimos a variavel
            reverse = reverse *10 + ultimoDigito; //e depois multiplicamos para que ela volte ao valor normal
            numero = numero / 10; //como estamos replicando os valores devemos decrementar do total então dividimos por 10
        }
        return naoNegativo == true? reverse *-1 : reverse; //se caso o número em que estivermos trabalhando for negativo ele multiplica por -1, se for positivo retorna normal
    }
}
