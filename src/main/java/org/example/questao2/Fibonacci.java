package org.example.questao2;

public class Fibonacci {

    public static String verificarSeqFibonnaci(int alvo) {

        int penultimo = 0;
        int ultimo = 1;

        int valorAtual = 0;

        while(valorAtual < alvo){

            valorAtual = ultimo + penultimo;

            penultimo = ultimo;
            ultimo = valorAtual;

        }

        if (valorAtual == alvo){
            return "O Valor " + alvo + " informado pertence a seguencia de fibonacci";

        }
        return "O Valor " + alvo + " informado NÃO pertence a seguencia de fibonacci";

    }
}
