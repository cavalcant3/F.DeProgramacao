package main.java.com.company.revisao.parte1.lista03;

public class q3 {
    public static void main(String[] args) {
        /*De acordo com um valor fornecido pelo usuário, verifique se esse valor é múltiplo de
3 e múltiplo de 7. Apresente uma mensagem mostrando o número digitado e o resultado do teste*/
        double numero = 3;
        double result1;
        double result2 = numero % 7;
        result1 = numero % 3;
        if (result1 == 0 && result2 == 0) {
            System.out.println("deu certo");
            System.out.println("o numero digitado foi:" + numero);
        } else {
            System.out.println("o numero digitado foi:" + numero);
            System.out.println("Deu merda");
        System.out.println(result1 + result2);
        }
    }
}
