package com.company.segundoBimestre.lista01.Q2;

import java.util.Scanner;

public class TestLocadora {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

//        nessa classe recebemos os dados e usamos sobrecarga de metodos para a resolução
        System.out.println("Informe Quantos dias você ficou com o carro:");
        int Dias = sc1.nextInt();
        System.out.println("Informe Quantos Km você ficou com o carro:");
//        para não dar erro no scanner você deve usar ","
//        ao separar as unidades, ex: 15,5 // erro se usar o ponto: 15.5
        double Km = sc2.nextDouble();
//        Nessa linha já enviamos e recebemos os parmetros
        System.out.println("Seu valor com Desconto é:" + locadora.CalcularValor(Dias, Km));


    }
}
