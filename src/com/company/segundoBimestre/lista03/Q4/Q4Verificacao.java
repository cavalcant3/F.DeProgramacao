package com.company.segundoBimestre.lista03.Q4;

public class Q4Verificacao {
    //        criando um array para verificação de estados
//        percorrendo o array e retornando se está correto ou não
//    (MG 7%; SP 12%; RJ 15%; MS
    String[] estadosCorretos  = new String[]{"MG", "SP", "RJ", "MS"};

    public boolean verificacao (String estados){
        for (int i = 0; i < estadosCorretos.length; i++) {
            if (estados.equals(estadosCorretos[i])){
                return true;
            }

        }
        System.out.println("ERRO: estado incorreto");;
        return false;
    }

}
