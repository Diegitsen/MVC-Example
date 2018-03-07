package com.example.diego.mvcexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoActivity extends AppCompatActivity {

    TextView tvCuadrado;
    EditText etCuadrado;
    AlCuadradoModel m = new AlCuadradoModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_cuadrado);
        tvCuadrado = findViewById(R.id.tvCuadrado);
        etCuadrado = findViewById(R.id.etCuadrado);
    }

    private void calcular()
    {

        m.alCuadrado(etCuadrado.toString());
    }

}
