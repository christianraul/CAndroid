package com.example.cejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText et01, et02;
    private Button  btnsuma, btnresta, btnmultificar, btndividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et01=findViewById(R.id.et1);
        et02=findViewById(R.id.et2);
        btnsuma=findViewById(R.id.btnSuma);
        btnresta= findViewById(R.id.btnResta);
        btnmultificar=findViewById(R.id.btnMultiplicar);
        btndividir=findViewById(R.id.btnDivision);


        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resultado = suma(Integer.valueOf(et01.getText().toString()),
                        Integer.valueOf(et02.getText().toString()));

                Toast.makeText(MainActivity.this, "El resultado la suma es: "+resultado, Toast.LENGTH_SHORT).show();

            }
        });

        btnresta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int resultado= restar(Integer.valueOf(et01.getText().toString()),
                                Integer.valueOf(et02.getText().toString()));
                Toast.makeText(MainActivity.this, "El resultado de la resta es:"+resultado, Toast.LENGTH_SHORT).show();
            }
        });
        btnmultificar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int resultado= multi(Integer.valueOf(et01.getText().toString()),
                        Integer.valueOf(et02.getText().toString()));
                Toast.makeText(MainActivity.this, "El resultado de la Multiplicación es:"+resultado, Toast.LENGTH_SHORT).show();
            }
        });
        btndividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int resultado= div(Integer.valueOf(et01.getText().toString()),
                        Integer.valueOf(et02.getText().toString()));
                Toast.makeText(MainActivity.this, "El resultado de la División es:"+resultado, Toast.LENGTH_SHORT).show();
            }
        });
    }


    public int suma(int num1, int num2){
        return num1+num2;

    }
    public int restar(int num1, int num2){
        return num1-num2;
    }
    public int multi(int num1, int num2){
        return num1*num2;
    }
    public int div(int num1, int num2){
        return num1/num2;
    }
}
