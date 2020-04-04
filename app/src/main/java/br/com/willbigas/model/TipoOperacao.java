package br.com.willbigas.model;

public enum TipoOperacao {

    SOMA("+"),
    SUBTRACAO("-"),
    MULTIPLICACAO("*"),
    DIVISAO("/");

    private String descricao;


    TipoOperacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
