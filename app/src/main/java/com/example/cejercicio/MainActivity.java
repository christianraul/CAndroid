package com.example.cejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText et01, et02;
    private Button btncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et01=findViewById(R.id.et1);
        et02=findViewById(R.id.et2);
        btncalcular=findViewById(R.id.btnCalcular);


        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resultado = suma(Integer.valueOf(et01.getText().toString()),
                        Integer.valueOf(et02.getText().toString()));

                Toast.makeText(MainActivity.this, "El resultado es: "+resultado, Toast.LENGTH_SHORT).show();

            }
        });
    }

    public int suma(int num1, int num2){
        return num1+num2;

    }

}
