package main.java.com.company.revisao.parte1.lista05;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int numero = 0;
        int soma = 0;
        int media = 0;
        int mediaPar = 0;
        int pares = 0;
        int maior = 0;
        int menor = 0;
        int produto = 1;
        int contador = 0;
        int contadorPar = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("informe o numero");
        numero = sc.nextInt();
        while (numero > 0) {
            soma = numero + soma;
            contador++;
            media = numero / contador;
            if (numero < menor) {
                menor = numero;
            } else if (numero > maior) {
                maior = numero;

            }
            if (numero % 2 == 0) {
                pares += numero;
                contadorPar++;
                mediaPar= pares/contadorPar;
            }
            System.out.println("informe o numero");
            numero = sc.nextInt();
        }

        System.out.println("soma: "+ soma);
        System.out.println("media: "+ media);
        System.out.println("maior: "+ maior);
        System.out.println("menor: "+ menor);
        System.out.println("pares: "+ pares);
        System.out.println("contador pares: "+ contadorPar);
        System.out.println("mediaPar: "+ mediaPar);
    }
}
