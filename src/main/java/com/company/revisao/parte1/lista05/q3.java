package main.java.com.company.revisao.parte1.lista05;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int numero=0;
        int soma=0;
        int produto=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o numero");
        numero = sc.nextInt();
        while (numero>0){
            if (numero%2==0){
                soma += numero;
            } else {
                produto = (numero*produto);
            }
            System.out.println("informe o numero");
            numero = sc.nextInt();
        }
        System.out.println(soma);
        System.out.println(produto);
    }
}
