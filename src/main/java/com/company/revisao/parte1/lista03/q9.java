package main.java.com.company.revisao.parte1.lista03;

public class q9 {
    public static void main(String[] args) {
        /*Determine se um determinado ano lido é bissexto. Sendo que um ano é bissexto se
for divisível por 400 ou se for divisível por 4 e não for divisível por 100. Por exemplo: 1988, 1992,
1996*/
        int ano = 1988;
        if (ano % 4 ==0){
            System.out.println("bissexto");
        } else {
            System.out.println("não é bissexto");
        }
    }
}
