package main.java.com.company.revisao.parte1.lista03;

public class q7 {
    public static void main(String[] args) {
        /*Uma empresa resolveu dar um aumento de salário aos seus colaboradores e lhe
contrataram para desenvolver o programa que calculará os reajustes. Faça um algoritmo que
recebe o salário de um colaborador e reajuste-o segundo o seguinte critério:

Salários até R$ 280,00 (incluindo) : aumento de 20%.

Salários entre R$ 280,00 e R$ 700,00 : aumento de 15%.

Salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%. Salários de R$ 1500,00 em diante :
aumento de 5%.*/
        double salario = 1600;
        if (salario<280){
            salario = +salario *0.2;
            System.out.println(salario);
        } else if(salario>=280 && salario<=700){
            salario = +salario *0.15;
            System.out.println(salario);

        } else if (salario >= 700 && salario <= 1500) {
            salario = +salario * 0.10;
            System.out.println(salario);

        } else if (salario>1500){
            salario += salario * 0.5;
            System.out.println(salario);

        }
    }
}
