package main.java.com.company.revisao.parte1.lista06;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        /* Joana resolveu economizar dinheiro para comprar uma bolsa. Ela traçou como meta
depositar um valor X em seu cofrinho no primeiro dia da semana, e ir guardando a cada manhã o
valor do dia anterior acrescido de pelo menos R$ 0,50 (meta). Mas será que ela vai conseguir fazer
isso durante 15 dias? Para saber se o plano de Joana deu certo, escreva um programa que receba
como entrada o valor inicial depositado, e em seguida os valores depositados a cada dia. Ao final,
exiba o total poupado e quantas vezes Joana conseguiu cumprir sua meta*/

        double cofrinho = 0;
        double cofrinhoTotal = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("valor para depositar hoje: ");
            cofrinho = sc.nextDouble();
            cofrinhoTotal += cofrinho;

        }
        System.out.println(cofrinhoTotal);
    }
}
