package main.java.com.company.revisao.parte1.lista02;

import java.util.Scanner;

public class q5 {
    /*suponha que uma escola utilize, como código de matrícula, um número inteiro no
formato AASDDD, onde:
• Os dois primeiros dígitos, representados pela letra A, são os dois últimos algarismos do ano da
matrícula;
• O terceiro dígito, representado pela letra S, vale 1 ou 2, conforme o aluno tenha se matriculado no
1º ou 2º semestre;
• Os quatro últimos dígitos, representados pela letra D, correspondem à ordem da matrícula do
aluno, no semestre e no ano em questão.
Crie um algoritmo que leia o número de matrícula de um aluno e imprima o ano e o semestre em
que ele foi matriculado*/
    public static void main(String[] args) {
        System.out.println("informe a matricula");
        Scanner sc = new Scanner(System.in);
        String xpto = sc.next();
        System.out.println("ele foi matriculado no ano de: " + xpto.substring(0,2));
        System.out.println("ele foi matriculado no semestre : " + xpto.substring(2,3));

    }
}
