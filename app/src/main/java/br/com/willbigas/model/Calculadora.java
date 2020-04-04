package br.com.willbigas.model;

import java.util.List;

public class Calculadora {

    private Double numero1;
    private Double numero2;
    private Double resultado;
    private List<HistoricoDeCalculo> historico;

    public Calculadora() {
    }

    public Calculadora(List<HistoricoDeCalculo> historico) {
        this.historico = historico;
    }

    public Calculadora(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora(Double numero1, Double numero2, List<HistoricoDeCalculo> historico) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.historico = historico;
    }

    public void somar(Double numero1, Double numero2) {
        resultado = numero1 + numero2;
    }

    public void subtrair(Double numero1, Double numero2) {
        resultado = numero1 - numero2;
    }

    public void multiplicar(Double numero1, Double numero2) {
        resultado = numero1 * numero2;
    }

    public void dividir(Double numero1, Double numero2) {
        resultado = numero1 / numero2;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public List<HistoricoDeCalculo> getHistorico() {
        return historico;
    }

    public void setHistorico(List<HistoricoDeCalculo> historico) {
        this.historico = historico;
    }
}
