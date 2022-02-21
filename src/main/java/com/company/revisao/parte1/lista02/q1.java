package main.java.com.company.revisao.parte1.lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

/*. Efetue a leitura de um número real e imprima o resultado
 do quadrado desse número
com 2 casas decimais.*/
public class q1 {
    public static void main(String[] args) {
        float numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o numero");
        numero = sc.nextFloat();
        numero = numero * numero;

        DecimalFormat df = new DecimalFormat("##,##");
        System.out.println("o numero formatado é:"+ df.format(numero));
    }
}
