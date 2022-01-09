package com.company.segundoBimestre.lista01;


//Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas
//vendas oferecendo desconto. Faça um algoritmo que possa receber um valor de um produto e que
//escreva o novo valor tendo em vista que o desconto foi de 9%
public class Q1 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do produto");
        //aqui vair ser um leitor para o usuario
        double Valor = 15.5;
        Valor = Valor * 0.09;
        System.out.println("O novo valor é" + Valor);
    }

}
