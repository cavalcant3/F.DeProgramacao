package com.company.segundoBimestre.lista04;

import java.util.Scanner;


public class Q4 {
    /*Fernanda tem um projeto de extensão e precisa selecionar alunos. Escreva um
programa para que ela possa informar matrícula e CRE (Coeficiente de Rendimento do Estudante)
dos vários inscritos, e apresente, ao final, a matrícula do aluno com menor CRE e o CRE médio de
todos os candidatos. Como entrada, então haverá um String (matrícula) e um float (CRE) para cada
candidato. A entrada de dados deve parar quando for informada a matrícula 999*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String matricula, matricularMenor = null;
        int cre, menor = 0, creMedio, soma = 0;
        int cont = 0;

        System.out.println("Digite a matricula");
        matricula = sc.next();
        while (!matricula.equals("999")) {
            System.out.println("digite o cre:");
            cre = sc.nextInt();
            cont++;
            if (cont == 1) {
                menor = cre;
                matricularMenor = matricula;
            } else {
                if (cre <= menor) {
                    menor = cre;
                    matricularMenor = matricula;
                }
            }
            soma += cre;
            System.out.println("Digite a matricula");
            matricula = sc.next();
        }
        if (cont>0){
            creMedio = soma/cont;
            System.out.println("cre medio:"+creMedio);
            System.out.println("matricula menor:"+matricularMenor);
        }


    }
}
