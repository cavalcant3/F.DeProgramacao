package main.java.com.company.revisao.parte1.lista03;

public class q6 {
    public static void main(String[] args) {
    /*Escreva um programa que leia o valor do índice de acidez (pH) de uma solução e
informe se ela é ácida, básica ou neutra.
A solução é ácida quando o pH é menor que 7;
A solução é básica quando o pH é maior que 7;
 Caso contrário a solução é neutra*/
        double ph=-5;
        if (ph>7){
            System.out.println("basica");
        } else if (ph<7){
            System.out.println("acida");
        } else {
            System.out.println("neutra");
        }
    }
}
