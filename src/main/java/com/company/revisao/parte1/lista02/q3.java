package main.java.com.company.revisao.parte1.lista02;

import java.text.DecimalFormat;

public class q3 {
    public static void main(String[] args) {
        /*A importância de R$ 520.000,00 será dividida entre três ganhadores de um concurso.
Sendo que da quantia total:
_ O primeiro ganhador receberá 45%;
_ O segundo receberá 30%;
_ O terceiro receberá o restante;
Calcule e imprima a quantia ganha por cada um dos ganhadores*/
        int premioTotal = 52000000;
        double ganhador1;
        double ganhador2;
        double ganhador3;
        ganhador1 = premioTotal * 0.45;
        ganhador2 = premioTotal * 0.30;
        ganhador3 = premioTotal * 25;
        DecimalFormat df = new DecimalFormat("000");
        System.out.println("ganahdor 1 : "+df.format(ganhador1));
        System.out.println("ganahdor 2 : "+df.format(ganhador2));
        System.out.println("ganahdor 3 : "+df.format(ganhador3));

    }
}
