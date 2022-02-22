package main.java.com.company.revisao.parte1.lista04;

public class q2 {
    public static void main(String[] args) {
        int soma=0;
        int contador=0;
        for (int i = 50; i <70 ; i++) {
            if (i%2==0){
                soma = i+soma;
                contador++;
            }

        }
        double media = soma/contador;
        System.out.println("soma "+soma);
        System.out.println("media "+media);
    }
}
