package main.java.com.company.revisao.parte1.lista05;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int numero=0;
        int soma = 0;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("numeroo");
        numero = sc.nextInt();
        while (numero>0){
            if (numero%2==0){
                soma+=numero;
                cont++;
            }
            System.out.println("numeroo");
            numero = sc.nextInt();
        }
        double media = soma/cont;
        System.out.println(soma);
        System.out.println(media);
    }
}
