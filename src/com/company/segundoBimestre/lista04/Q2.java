package com.company.segundoBimestre.lista04;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        int qtdAlunosPt = 0;
        int qtdVotos = 3;
        int qtdAlunosMt = 0;
        int votacao1 = 0;
        int votacao2 = 0;
        int votacao3 = 0;
        Scanner sc = new Scanner(System.in);
        String vt = """
                Vote na sua matéria preferida:
                [1] - Portugues
                [2] - MAtemática
                """;
        String vt2 = """
                Vote na sua matéria preferida em 2 lugar:
                [1] - Portugues
                [2] - MAtemática
                """;
        String vt3 = """
                Vote na sua matéria menos preferida:
                [1] - Portugues
                [2] - MAtemática
                """;
        for (int i = 0; i < qtdVotos; i++) {
            do {
                System.out.println(vt);
                votacao1 = sc.nextInt();
            } while (votacao1 != 1 && votacao1 != 2 && votacao1 != 3);
            do {
                System.out.println(vt2);
                votacao2 = sc.nextInt();
            } while (votacao2 != 1 && votacao2 != 2 && votacao2 != 3);
            do {
                System.out.println(vt3);
                votacao3 = sc.nextInt();

            } while (votacao3 != 1 && votacao3 != 2 && votacao3 != 3);
            switch (votacao1) {
                case 1:
                    qtdAlunosPt++;
                    break;
                case 2:
                    qtdAlunosMt++;
                    break;

            }


            System.out.println("Quantidade de alunos que preferem a disciplina de matematica: " + qtdAlunosMt);
            System.out.println("Quantidade de alunos que preferem a disciplina de português: " + qtdAlunosPt);

            if (qtdAlunosMt > qtdAlunosPt) {
                double porcentagem = (qtdAlunosMt * 100) / qtdVotos;
                System.out.println("A maior quantidade de votos foi de matématica.");
                System.out.println(" e sua porcentagem em relação aos votos foi de:" + porcentagem + "%");
            }
            if (qtdAlunosMt < qtdAlunosPt) {
                double porcentagem = (qtdAlunosPt * 100) / qtdVotos;
                System.out.println("A maior quantidade de votos foi de português.");
                System.out.println(" e sua porcentagem em relação aos votos foi de:" + porcentagem + "%");
            }

        }

    }
}
