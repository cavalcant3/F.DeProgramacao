package main.java.com.company.revisao.parte1.lista03;

public class q5 {
    public static void main(String[] args) {
       /*Escreva um programa que calcule o salário semanal de um trabalhador. As entradas
são o número de horas usadas na semana e o valor da hora. Até 40 h/semana usa-se a
valorização dada. Acima de 40h e até 60h há um bônus de 50% para essas horas. Acima de 60h
há um bônus de 100% para essas horas*/

        double horasSemana = 70;
        double ValorHoraa = 5;
        double horaTotal = 0;

        if (horasSemana >= 40 && horasSemana <= 60) {
            horasSemana += horasSemana * 0.5;
            horaTotal = horasSemana*ValorHoraa;
            System.out.println("total valor a receber: "+horaTotal);
        } else {
            horasSemana += horasSemana * 1.0;
            horaTotal = horasSemana*ValorHoraa;
            System.out.println("total valor a receber: "+horaTotal);

        }
    }
}
