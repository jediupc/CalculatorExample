package com.example.inlab.calculatorexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    String content = "";
    TextView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button uno = (Button) findViewById(R.id.tecla_1);
        Button igual = (Button) findViewById(R.id.tecla_igual);
        Button mas = (Button) findViewById(R.id.tecla_mas);
        pantalla  = (TextView) findViewById(R.id.pantalla);
        pantalla.setText(content);

        uno.setOnClickListener(this);
        mas.setOnClickListener(this);

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double resultado = parseContent(content);
                Toast.makeText(getApplicationContext(),"Calculando...",Toast.LENGTH_SHORT).show();
                pantalla.setText(String.valueOf(resultado));
            }
        });


    }

    @Override
    public void onClick(View view) {
        if (pantalla.getText().toString().equals("42.0")) {
            pantalla.setText("");
            content = "";
        }
        Button b = (Button) view;
        String buttonText = b.getText().toString();
        content = content + buttonText;
        pantalla.setText(content);
    }

    double parseContent(String content) {
        // MAGIC HAPPENS HERE
        return 42.0;
    }
}
