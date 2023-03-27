package org.example.questao3;

import java.util.Iterator;
import java.util.Map;

public class Faturamento {

    private FaturamentoData dados;

    public Faturamento(FaturamentoData dados) {
        this.dados = dados;
    }

    public FaturamentoData getDados() {
        return dados;
    }

    public void setDados(FaturamentoData dados) {
        this.dados = dados;
    }

    public static Double encontrarMenorValorFaturamentoDia(FaturamentoData dados) {

        double menorValor = Double.MAX_VALUE;

        Iterator<Map<Integer, Double>> iterador = dados.getValoresDiarios().iterator();
        int i = 0;
        while(iterador.hasNext()){
            double valorAtual = iterador.next().get(i+1);
            i++;

            if(valorAtual == 0.0) continue;

            if(menorValor > valorAtual) {
                menorValor = valorAtual;
            }
        }

        return menorValor;

    }

    public static Double encontrarMaiorValorFaturamentoDia(FaturamentoData dados) {

        double maiorValor = Double.MIN_VALUE;

        Iterator<Map<Integer, Double>> iterador = dados.getValoresDiarios().iterator();
        int i = 0;
        while(iterador.hasNext()){
            double valorAtual = iterador.next().get(i+1);
            i++;

            if(valorAtual == 0.0) continue;

            if(maiorValor < valorAtual) {
                maiorValor = valorAtual;
            }
        }

        return maiorValor;

    }

    private static Double mediaFaturamentoDiario(FaturamentoData dados) {
        Double media = 0.0;

        Iterator<Map<Integer, Double>> iterador = dados.getValoresDiarios().iterator();
        int i = 0;
        while(iterador.hasNext()){
            double valorAtual = iterador.next().values().stream().findFirst().get();

            if(valorAtual == 0.0) continue;
            media += valorAtual;
            i++;
        }

        return media/i;
    }

    public static int encontrarNumeroDiasAcimaMedia(FaturamentoData dados) {
        Double media = mediaFaturamentoDiario(dados);

        Iterator<Map<Integer, Double>> iterador = dados.getValoresDiarios().iterator();
        int i = 0, qtdDiasAcimaMedia = 0;
        while(iterador.hasNext()){
            double valorAtual = iterador.next().get(i+1);
            i++;

            if(valorAtual > media) {
                qtdDiasAcimaMedia++;
            }
        }

        return qtdDiasAcimaMedia;
    }

    public Double encontrarMenorValorFaturamentoDia() {

        double menorValor = Double.MAX_VALUE;

        Iterator<Map<Integer, Double>> iterador = this.dados.getValoresDiarios().iterator();
        int i = 0;
        while(iterador.hasNext()){
            double valorAtual = iterador.next().get(i+1);
            i++;

            if(valorAtual == 0.0) continue;

            if(menorValor > valorAtual) {
                menorValor = valorAtual;
            }
        }

        return menorValor;

    }

    public Double encontrarMaiorValorFaturamentoDia() {

        double maiorValor = Double.MIN_VALUE;

        Iterator<Map<Integer, Double>> iterador = this.dados.getValoresDiarios().iterator();
        int i = 0;
        while(iterador.hasNext()){
            double valorAtual = iterador.next().get(i+1);
            i++;

            if(valorAtual == 0.0) continue;

            if(maiorValor < valorAtual) {
                maiorValor = valorAtual;
            }
        }

        return maiorValor;

    }

    private Double mediaFaturamentoDiario() {
        Double media = 0.0;

        Iterator<Map<Integer, Double>> iterador = this.dados.getValoresDiarios().iterator();
        int i = 0;
        while(iterador.hasNext()){
            double valorAtual = iterador.next().values().stream().findFirst().get();

            if(valorAtual == 0.0) continue;
            media += valorAtual;
            i++;
        }

        return media/i;
    }

    public int encontrarNumeroDiasAcimaMedia() {
        Double media = mediaFaturamentoDiario();

        Iterator<Map<Integer, Double>> iterador = dados.getValoresDiarios().iterator();
        int i = 0, qtdDiasAcimaMedia = 0;
        while(iterador.hasNext()){
            double valorAtual = iterador.next().get(i+1);
            i++;

            if(valorAtual > media) {
                qtdDiasAcimaMedia++;
            }
        }

        return qtdDiasAcimaMedia;
    }
}
