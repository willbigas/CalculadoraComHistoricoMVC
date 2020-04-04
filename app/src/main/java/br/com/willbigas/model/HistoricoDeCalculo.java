package br.com.willbigas.model;

public class HistoricoDeCalculo {

    private Double numero1;
    private Double numero2;
    private Double resultado;
    private TipoOperacao tipoOperacao;


    public HistoricoDeCalculo(Double numero1, Double numero2, Double resultado, TipoOperacao tipoOperacao) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
        this.tipoOperacao = tipoOperacao;
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

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
}
