package main.java.com.company.revisao.parte1.lista06;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        /* Desenvolva um programa em Portugol que deve mostrar o total de recursos que
foram arrecadados com a aplicação de multas de trânsito. Assim, o programa deve ler as seguintes
informações
para cada motorista: O número da carteira de motorista; Número de multas;
valor da cada uma das multas.
Deve ser impresso o valor da dívida de cada motorista
e ao final da leitura o total de recursos arrecadados.
O programa deverá imprimir também o número da carteira do motorista que obteve o maior número de multas.
Para finalizar o programa deverá ser digitado a carteira de habilitação igual a 0.*/
        int numeroCarteira = 0;
        int numeroCarteiraBarbeiro = 0;
        int numeroMultas = 2;
        int numeroMultasMaior = 2;
        double valorMultas = 0;
        double somaMultas = 0;
        double totGeral = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("numerocarteira");
        numeroCarteira = sc.nextInt();
        while (numeroCarteira != 0) {
            System.out.println("qunatas multas?");
            numeroMultas = sc.nextInt();

            for (int i = 0; i < numeroMultas; i++) {
                System.out.println("Valor da multa: " + i + " :");
                valorMultas = sc.nextDouble();
                somaMultas += valorMultas;

            }
            if (numeroMultas > numeroMultasMaior) {
                numeroMultasMaior = numeroMultas;
                numeroCarteiraBarbeiro = numeroCarteira;
            }
            totGeral += somaMultas;
            System.out.println("Carteira de motorista: " + numeroCarteira);
            System.out.println("valor a pagar: " + somaMultas);

            System.out.println("numerocarteira");
            numeroCarteira = sc.nextInt();
        }
        System.out.println("maior numero de multas, carteira: " + numeroCarteiraBarbeiro);
        System.out.println("total arrecadado: " + totGeral);

    }
}
