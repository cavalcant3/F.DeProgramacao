package main.java.com.company.revisao.parte1.lista03;

public class q2 {
    public static void main(String[] args) {
        /* Receber o salário de um trabalhador e o valor da prestação de um empréstimo, se a
prestação for maior que 20% do salário, mostre a mensagem: “Empréstimo não concedido”, caso
contrário mostre “Empréstimo concedido”
*/
        double salario=900;
        double emprestimoPrestacao = 600;
        String MensagemOk = "emprestimo concedido";
        String MensagemNaoOk = "emprestimo nao concedido";
         double SalarioPorcentagem = salario*0.20;
        String resultado = emprestimoPrestacao>SalarioPorcentagem ? MensagemNaoOk : MensagemOk ;
        System.out.println(resultado);

    }
}
