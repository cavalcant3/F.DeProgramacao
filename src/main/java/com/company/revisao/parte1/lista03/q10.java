package main.java.com.company.revisao.parte1.lista03;

public class q10 {
    public static void main(String[] args) {
        /*. Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e
12, e se o dia existe naquele mês. Note que Fevereiro tem 29 dias em anos bissextos, e 28 dias
em anos não bissextos.
*/
        int dia = 28;
        int mes = 2;
        int ano = 1988;
        boolean bissexto;
        if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)) {
            bissexto = true;
        } else {
            bissexto = false;

        }
        switch (mes) {
            case 2:
                if (bissexto) {
                    if ((dia <= 29) && (dia > 0)) {
                        System.out.println("data valida");

                    } else {
                        System.out.println("data inválida");
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if ((dia > 0) && (dia <= 31)) {
                    System.out.println("data válida");
                } else {
                    System.out.println("data invalida");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if ((dia > 0) && (dia <= 30)) {
                    System.out.println("data válida");
                } else {
                    System.out.println("data invalida");
                }
                break;
            default:
                System.out.println("data invalida");
                break;


        }
    }
}
