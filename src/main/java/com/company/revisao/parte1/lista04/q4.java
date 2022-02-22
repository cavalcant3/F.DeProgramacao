package main.java.com.company.revisao.parte1.lista04;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int numero = 0;
        int cont_primos = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 10; i++) {
            int contador = 0;
            numero = sc.nextInt();
            for (int j = 1; j < numero; j++) {
                if ((numero % j == 0)) {
                    contador++;
                }

            }
            if (contador<=2){
                System.out.println("é primo "+numero);
                cont_primos++;
            }
        }



        System.out.println("total de numeros primos: "+cont_primos);
    }
}
