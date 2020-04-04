package br.com.willbigas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import br.com.willbigas.R;
import br.com.willbigas.controller.MainController;

public class MainActivity extends AppCompatActivity {

    private MainController mainController;

    private EditText edtNumero1;
    private EditText edtNumero2;

    private Button btnSomar;
    private Button btnSubtrair;
    private Button btnMultiplicar;
    private Button btnDividir;

    private LinearLayout layoutResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();
        inicializarListeners();
        mainController = new MainController(this);
    }

    private void inicializarComponentes() {
        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);

        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        layoutResultado = findViewById(R.id.layoutResultado);
    }

    private void inicializarListeners() {
        listenerButtonSomar();
        listenerButtonSubtrair();
        listenerButtonMultiplicar();
        listenerButtonDividir();
    }

    private void listenerButtonSomar() {
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainController.somar();
            }
        });
    }

    private void listenerButtonSubtrair() {
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainController.subtrair();
            }
        });
    }

    private void listenerButtonMultiplicar() {
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainController.multiplicar();
            }
        });
    }

    private void listenerButtonDividir() {
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainController.dividir();
            }
        });
    }


    public EditText getEdtNumero1() {
        return edtNumero1;
    }

    public EditText getEdtNumero2() {
        return edtNumero2;
    }

    public Button getBtnSomar() {
        return btnSomar;
    }

    public Button getBtnSubtrair() {
        return btnSubtrair;
    }

    public Button getBtnMultiplicar() {
        return btnMultiplicar;
    }

    public Button getBtnDividir() {
        return btnDividir;
    }

    public LinearLayout getLayoutResultado() {
        return layoutResultado;
    }
}
