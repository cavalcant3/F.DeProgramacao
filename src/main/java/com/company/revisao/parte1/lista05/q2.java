package main.java.com.company.revisao.parte1.lista05;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int numero=0;
        int maior=0;
        int menor=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o numero");
        numero = sc.nextInt();
        while (numero!=0){
            if (numero>maior){
                maior=numero;
            } else if (numero<menor){
                menor = numero;
            }
            System.out.println("informe o numero");
            numero = sc.nextInt();
        }

        System.out.println(maior);
        System.out.println(menor);
    }
}
