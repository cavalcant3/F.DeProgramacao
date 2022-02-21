package main.java.com.company.revisao.parte1.lista03;

public class q4 {
    public static void main(String[] args) {
        /*Fazer um programa para ler o dia, mês e ano de nascimento de uma pessoa, calcular
e mostrar sua idade no dia de hoje, também, verificar e mostrar se ela já tem idade para votar (16
anos ou mais) e para conseguir a Carteira de Habilitação (18 anos ou mais). Obs.: desconsidere a
possibilidade de anos bissextos.
*/
        int dia = 27;
        int mes = 12;
        int ano = 2001;
        int verificacaoMaiorIdade = 2022 - ano;
        if (verificacaoMaiorIdade>18){
        System.out.println("voce pode votar");
        } else{
            System.out.println("nao vota");
        }

    }
}
