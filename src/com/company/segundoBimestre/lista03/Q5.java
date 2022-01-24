package com.company.segundoBimestre.lista03;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int classificacao = 0;
        System.out.println("Telefonou para a vítima?");
        Scanner sc = new Scanner(System.in);
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            classificacao = classificacao + 1;
        }
        System.out.println("Esteve no local do crime?");
        resposta = sc.next().charAt(0);

        if (resposta == 's') {
            classificacao = classificacao + 1;
        }
        System.out.println("Mora perto da vítima?");
        resposta = sc.next().charAt(0);

        if (resposta == 's') {
            classificacao = classificacao + 1;
        }
        System.out.println("Devia para a vítima?");
        resposta = sc.next().charAt(0);

        if (resposta == 's') {
            classificacao = classificacao + 1;
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta = sc.next().charAt(0);

        if (resposta == 's') {
            classificacao = classificacao + 1;
        }
        if (classificacao == 2) {
            System.out.println("Suspeita");
        } else if (classificacao == 3 || classificacao == 4){
            System.out.println("Cúmplice");
        } else if (classificacao == 5 ){
            System.out.println("Assassino");
        } else{
            System.out.println("Inocente");
        }

//
    }
}
