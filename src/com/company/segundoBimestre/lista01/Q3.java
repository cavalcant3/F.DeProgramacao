package com.company.segundoBimestre.lista01;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a distancia");
        double DM = sc.nextDouble();
        System.out.println("Informe a velocidade media");
        double VM = sc.nextDouble();
        double TM = DM / VM;
//        converetendo de km para m/s
        VM = VM / 3.6;
//      formatando numeros
        String PatternNumber = "###,###.##";
        DecimalFormat df = new DecimalFormat(PatternNumber);
        Format time = new SimpleDateFormat("HH:mm:ss");


        System.out.println("A velocidade em metros/segundos é: " + df.format(VM) + "M/S");
        System.out.println("O tempo médio é: " + time.format(TM));



    }
}