package com.company.Lista01;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
//         precisa calcular a quantidade de
//        piso
//
//        para uma sala, bem como a quantidade de tinta a ser usada nas paredes e teto. Precisa ainda
//        saber o volume da sala para estimar o ar-condicionado a ser utilizado. Escreva um programa que
//        receba os valores da largura, comprimento e altura da sala e imprima as informações solicitadas.


        Scanner sc = new Scanner(System.in);
//            area do ambiente
        float lateral = sc.nextFloat();
        float altura = sc.nextFloat();
        float areaAmbiente = lateral * altura;
//      area do piso
        float lateralPiso = sc.nextFloat();
        float alturaPiso = sc.nextFloat();
        float areaPiso = lateralPiso * alturaPiso;
        float finali = areaAmbiente / areaPiso;
//        tinta a ser usada
        float Tinta = sc.nextFloat();
       float TintaFinal = areaAmbiente - Tinta;
//      qtd de btu para o ar condicionado
        float QtdBtu = areaAmbiente * 750;
        System.out.println("Vão ser necessários"  + finali + " peças");
        System.out.println("Area a ser píntada:" + TintaFinal);
        System.out.println("A quantidade de BTU para ser usada é de:" + QtdBtu);







    }
}
