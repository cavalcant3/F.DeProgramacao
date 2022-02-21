package main.java.com.company.revisao.parte1.lista02;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        /*Você está envolvido em um projeto de engenharia e precisa calcular a quantidade de
piso para uma sala, bem como a quantidade de tinta a ser usada nas paredes e teto. Precisa ainda
saber o volume da sala para estimar o ar-condicionado a ser utilizado. Escreva um programa que
receba os valores da largura, comprimento e altura da sala e imprima as informações solicitadas.
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a altura da sala:");
        double altura = sc.nextDouble();
        System.out.println("informe a largura da parede da sala:");
        double largura = sc.nextDouble();
        double volumeSala = altura*largura;
        //ar
        //piso
        //tinta
        double piso=volumeSala/2;
        System.out.println("pisos necessarios: " +piso);
        double tinta = (volumeSala*2)/10;
        System.out.println("lts de tinta necessarios: " +tinta);
        double arCondicionado = (volumeSala * 7500);
        System.out.println("btus necessarios para o ar : " + arCondicionado);

    }
}
