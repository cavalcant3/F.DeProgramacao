package main.java.com.company.revisao.parte1.lista06;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        /* Leia um número positivo do usuário, então, calcule e imprima a sequência Fibonacci
até o primeiro número superior ao número lido. Exemplo: se o usuário informou o número 30, a
sequência a ser impressa será 0 1 1 2 3 5 8 13 21 34.*/

        int v1 = -1, v2 = 1, v3 = 0, cont = 0, limite = 0;
        System.out.println("informe o limite");
        Scanner sc = new Scanner(System.in);
        limite = sc.nextInt();
        for (int i = 0; i < limite; i++) {
            v3= v1+v2;
            v1=v2;
            v2=v3;

            System.out.println(v3);

        }
    }
}
