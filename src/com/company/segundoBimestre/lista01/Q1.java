package com.company.segundoBimestre.lista01;


//Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas
//vendas oferecendo desconto. Faça um algoritmo que possa receber um valor de um produto e que
//escreva o novo valor tendo em vista que o desconto foi de 9%
public class Q1 {
    public static void main(String[] args) {
        System.out.println("Informe o valor do produto");
        //aqui vair ser um leitor para o usuario
//        Aqui pegamos o valor inicial
        double ValorI = 15.5;
        double Desconto = 0.09;
//          Aqui pegamos o vlaor inicial, multiplicamos pelo valor do desconto
//          e depois subtraimos do valor original, atribuindo o valor a nova variavel.
        double  NovoValor = ValorI - (ValorI * Desconto);
        System.out.println("O novo valor é" + NovoValor);
    }

}