package br.com.willbigas.controller;

import android.view.Gravity;
import android.widget.TextView;

import br.com.willbigas.R;
import br.com.willbigas.model.Calculadora;
import br.com.willbigas.service.CalculadoraService;
import br.com.willbigas.util.DecimalFormat;
import br.com.willbigas.view.MainActivity;

public class MainController {

    private MainActivity mainActivity;

    private Calculadora calculadora;
    private CalculadoraService calculadoraService;

    public MainController(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        inicializarCalculadora();
        inicializarControllers();
    }

    private void inicializarControllers() {
        calculadoraService = new CalculadoraService();
    }

    private void inicializarCalculadora() {
        calculadora = new Calculadora();
    }

    public void somar() {
        if (validarDadosDaView()) {
            receberDadosDaView();
            calculadora = calculadoraService.somar(calculadora);
            exibirDadosNaView();
            limparDados();
        }
    }

    public void subtrair() {
        if (validarDadosDaView()) {
            receberDadosDaView();
            calculadora = calculadoraService.subtrair(calculadora);
            exibirDadosNaView();
            limparDados();
        }
    }

    public void multiplicar() {
        if (validarDadosDaView()) {
            receberDadosDaView();
            calculadora = calculadoraService.multiplicar(calculadora);
            exibirDadosNaView();
            limparDados();
        }
    }

    public void dividir() {
        if (validarDadosDaView()) {
            receberDadosDaView();
            calculadora = calculadoraService.dividir(calculadora);
            exibirDadosNaView();
            limparDados();
        }
    }

    public void limparDados() {
        mainActivity.getEdtNumero1().setText("");
        mainActivity.getEdtNumero2().setText("");
        calculadora = new Calculadora(calculadora.getHistorico());
    }

    private boolean validarDadosDaView() {
        boolean foiValidado = true;

        if (mainActivity.getEdtNumero1().getText().toString() == null || mainActivity.getEdtNumero1().getText().toString().equals("")) {
            mainActivity.getEdtNumero1().setError(mainActivity.getString(R.string.required_numero1));
            foiValidado = false;
        }

        if (mainActivity.getEdtNumero2().getText().toString() == null || mainActivity.getEdtNumero2().getText().toString().equals("")) {
            mainActivity.getEdtNumero2().setError(mainActivity.getString(R.string.required_numero2));
            foiValidado = false;
        }
        return foiValidado;
    }

    private void receberDadosDaView() {
        calculadora = new Calculadora(Double.valueOf(mainActivity.getEdtNumero1().getText().toString()) , Double.valueOf(mainActivity.getEdtNumero2().getText().toString()));
    }

    private void exibirDadosNaView() {
        for (int i = 0; i < calculadora.getHistorico().size(); i++) {
            TextView tvResultado = new TextView(mainActivity);
            tvResultado.setTextSize(17);
            tvResultado.setGravity(Gravity.CENTER);
            tvResultado.setText(DecimalFormat.deDecimalParaString(calculadora.getHistorico().get(i).getNumero1()) + " " +calculadora.getHistorico().get(i).getTipoOperacao().getDescricao()  + " " + DecimalFormat.deDecimalParaString(calculadora.getHistorico().get(i).getNumero2()) + " = " + DecimalFormat.deDecimalParaString(calculadora.getHistorico().get(i).getResultado()));
            mainActivity.getLayoutResultado().addView(tvResultado);
        }
    }
}
