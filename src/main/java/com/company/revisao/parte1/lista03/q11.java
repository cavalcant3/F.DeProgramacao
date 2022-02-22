package main.java.com.company.revisao.parte1.lista03;

public class q11 {
    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;

        if ((a == b) && (a == c) && (b == c)) {
            System.out.println("equilatero");
        } else if ((a == b) && (a == c) || (b == c)){
            System.out.println("isoceles");

        }else if ((a != b) && (a != c) && (b != c)){
            System.out.println("escaleno");
        }
    }
}
