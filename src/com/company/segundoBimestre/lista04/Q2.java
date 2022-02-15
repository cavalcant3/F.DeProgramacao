package com.company.segundoBimestre.lista04;

import java.util.Scanner;

public class Q2 {
    /**/
    public static void main(String[] args) {
        int qtdAlunosPt = 0;
        int qtdVotos = 0;
        int qtdAlunosMt = 0;
        String vt = """
                Vote na sua matéria preferida:
                [1] - Portugues
                [2] - MAtemática
                """;
        Scanner sc = new Scanner(System.in);
        do {
            qtdVotos++;
            System.out.println(vt);
            int votacao = sc.nextInt();
            switch (votacao) {
                case 1:
                    qtdAlunosPt++;
                    break;
                case 2:
                    qtdAlunosMt++;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }

        } while (qtdVotos < 60);
        System.out.println("Quantidade de alunos que preferem a disciplina de matematica: "+qtdAlunosMt);
        System.out.println("Quantidade de alunos que preferem a disciplina de português: "+qtdAlunosPt);

        if (qtdAlunosMt>qtdAlunosPt){
            double porcentagem = (qtdAlunosMt* 100)/qtdVotos;
            System.out.println("A maior quantidade de votos foi de matématica.");
            System.out.println(" e sua porcentagem em relação aos votos foi de:" +porcentagem+"%");
        }
        if (qtdAlunosMt < qtdAlunosPt) {
            double porcentagem = (qtdAlunosPt * 100) / qtdVotos;
            System.out.println("A maior quantidade de votos foi de português.");
            System.out.println(" e sua porcentagem em relação aos votos foi de:" + porcentagem + "%");
        }

    }
}
