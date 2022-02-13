package com.example.calculadorachamba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    private TextView resultado;

    private EditText n1;
    private EditText n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultado=findViewById(R.id.resultado);

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);




        btn_suma=findViewById(R.id.btn_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              resultado.setText(suma(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()))+"" );
            }
        });


        btn_resta=findViewById(R.id.btn_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resta(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()))+"");
            }
        });
        btn_multiplicacion=findViewById(R.id.btn_multi);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(multiplicacion(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()))+"");
            }
        });
        btn_division=findViewById(R.id.btn_divi);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(division(Integer.parseInt(n1.getText().toString()),Integer.parseInt(n2.getText().toString()))+"");
            }
        });







    }

    public int suma (int a, int b){

        return a+b;
    }
    public int resta (int a, int b){

        return a-b;
    }
    public int multiplicacion (int a, int b){

        return a*b;
    }
    public int division (int a, int b){
        int resultado=0;
        if (b!=0){
            resultado=a/b;
        }



        return resultado;
    }


}
