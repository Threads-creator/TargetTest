package org.example.questao5;

public class Palavras {

    public static String inverterString(String palavra){
        String resultado = "";
        for (int i = palavra.length() - 1; i >= 0; i--){
            resultado = resultado.concat(Character.toString(palavra.charAt(i)));
        }

        return resultado;
    }

}
