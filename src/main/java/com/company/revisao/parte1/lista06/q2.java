package main.java.com.company.revisao.parte1.lista06;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        /*Questão 02. Está acontecendo uma gincana no IFS. A gincana é composta por 15 times. Cada time
possui 20 integrantes. O pessoal do BSI resolveu criar um programa, que receba o nome do time, a
idade e altura de seus integrantes e a pontuação de cada time, para analisar algumas estatísticas
do campeonato. Assim, desenvolva um algoritmo que mostre as seguintes estatísticas:
a) Qual a idade do integrante mais novo de cada time.
b) A altura média dos participantes da gincana.
c) O nome do time venceu a gincana
d) A pontuação média da gincana.
*/
        int pontuacao = 0, idade, novo=0, altura=0, alturaMedia=0, alturaSoma=0;
        double pontuacaoMaior=0,pontuacaoSoma=0, pontuacaoMedia=0;
        String time, nomeVencedor = null;
        Scanner sc = new Scanner(System.in);
//        percorre as informações do time
        for (int i = 0; i < 15; i++) {
            System.out.println("informe o nome do time: ");
            time = sc.next();
            System.out.println("informe a pontuação do time: ");
            pontuacao = sc.nextInt();
//            c) O nome do time venceu a gincana
            if (i==1){
                pontuacaoMaior = pontuacao;
                nomeVencedor = time;
            } else if (pontuacao>pontuacaoMaior){
                pontuacaoMaior = pontuacao;
                nomeVencedor = time;

            }
//            d) A pontuação média da gincana.
            pontuacaoSoma+= pontuacao;
            pontuacaoMedia = pontuacaoSoma/15;

//        percorre as informações do time
            for (int j = 0; j < 20; j++) {
//                a) Qual a idade do integrante mais novo de cada time.
                System.out.println("informe a idade do elemento");
                idade = sc.nextInt();
                if (j==1){
                    novo= idade;
                } else if (idade<novo){
                    novo=idade;
                }
//                b) A altura média dos participantes da gincana.
                System.out.println("informe a altura do elemento");
                altura = sc.nextInt();
                alturaSoma+=altura;

            }

        }
        alturaMedia = alturaSoma/(15*20);
    System.out.println("altura:" +alturaMedia);
    System.out.println("time vencedor:" +nomeVencedor);
    System.out.println("pontuacao media:" +pontuacaoMedia);
    }
}
