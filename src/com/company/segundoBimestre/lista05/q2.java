package com.company.segundoBimestre.lista05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
/*. Escreva um algoritmo que simule a situação. Ou seja, deverá ler o peso de cada pessoa e emitir
 uma mensagem quando o peso for excedido. Informe ainda quantas pessoas estão sendo transportadas.*/
        Scanner sc = new Scanner(System.in);
        double peso;
        double total = 0;
        int cont = 0;

        do {
            System.out.println("informe seu peso");
            DecimalFormat df = new DecimalFormat("#.##");
            peso = sc.nextDouble();df.format(peso);
           // total = (peso+tot);
            if (peso<=2){
                total += peso;
            cont++;
            } else{
                System.out.println("limite excedido");
                break;
            }

        }while (total<2);

        System.out.println("limite excedido");
        System.out.println("transporrtando um total de: "+cont+ " pessoas");

    }
}
