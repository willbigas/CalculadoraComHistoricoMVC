package br.com.willbigas.service;

import java.util.ArrayList;

import br.com.willbigas.model.Calculadora;
import br.com.willbigas.model.HistoricoDeCalculo;
import br.com.willbigas.model.TipoOperacao;

public class CalculadoraService {

    public Calculadora somar(Calculadora calculadora) {
        calculadora.somar(calculadora.getNumero1(), calculadora.getNumero2());
        gravarHistorico(calculadora, TipoOperacao.SOMA);
        return calculadora;
    }

    public Calculadora subtrair(Calculadora calculadora) {
        calculadora.subtrair(calculadora.getNumero1(), calculadora.getNumero2());
        gravarHistorico(calculadora, TipoOperacao.SUBTRACAO);
        return calculadora;
    }

    public Calculadora multiplicar(Calculadora calculadora) {
        calculadora.multiplicar(calculadora.getNumero1(), calculadora.getNumero2());
        gravarHistorico(calculadora, TipoOperacao.MULTIPLICACAO);
        return calculadora;
    }

    public Calculadora dividir(Calculadora calculadora) {
        calculadora.dividir(calculadora.getNumero1(), calculadora.getNumero2());
        gravarHistorico(calculadora, TipoOperacao.DIVISAO);
        return calculadora;
    }

    private Calculadora gravarHistorico(Calculadora calculadora, TipoOperacao tipoOperacao) {
        if (calculadora.getHistorico() == null) {
            calculadora.setHistorico(new ArrayList<HistoricoDeCalculo>());
        }

        HistoricoDeCalculo novoHistorico = new HistoricoDeCalculo(calculadora.getNumero1(), calculadora.getNumero2(), calculadora.getResultado(), tipoOperacao);
        calculadora.getHistorico().add(novoHistorico);
        return calculadora;
    }
}
