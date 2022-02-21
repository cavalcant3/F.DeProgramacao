package main.java.com.company.revisao.parte1.lista03;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        double numero = 0;
        String mensagemPar = "é par";
        String mensagemImpar = "é impar";
          System.out.println("informe o numero");
          Scanner sc = new Scanner(System.in);
          numero = sc.nextDouble();
        numero %= 2;
      String resultado =  numero != 0 ? mensagemImpar : mensagemPar;
        System.out.println(resultado);
    }
}
