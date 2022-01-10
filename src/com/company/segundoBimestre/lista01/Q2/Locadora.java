package com.company.segundoBimestre.lista01.Q2;
//A locadora de carros SAI DA FRENTE está fazendo uma promoção e está alugando
//carros no período natalino por R$ 30,00 a diária. Além disso, a locadora cobra R$ 0,01 por
//quilômetro rodado. A locadora quer fidelizar os clientes e está dando 10% de desconto no valor
//total do aluguel de qualquer carro. O usuário deve digitar quantos dias ficou com o carro e
//quantos quilômetros ele rodou. Apresente qual o valor que o cliente deve pagar.
public class Locadora {
   private int Dias;
    private double Km;

    public int getDias() {
        return Dias;
    }

    public double CalcularValor(int Dias, double Km){
       double KmVFinal = 0;
       double DiariaVFinal = 0;
//       calculando valor do km
        for (int i = 0; i < Km; i++) {
            KmVFinal = KmVFinal + 0.01;
        }
//        calculando valor das diarias
        for (int i = 0; i < Dias; i++) {
            DiariaVFinal = DiariaVFinal + 30;

        }
        //        calculando valor do desconto
        double Desconto = (DiariaVFinal + KmVFinal) * 0.10;
//              valor final
        double ValorDesconto = (DiariaVFinal + KmVFinal) - Desconto;
//        retornando o valor final e enviando a TestLocadora.java
        return ValorDesconto;
    }


    public void setDias(int dias) {
        Dias = dias;
    }

    public double getKm() {
        return Km;
    }

    public void setKm(double km) {
        Km = km;
    }
}
