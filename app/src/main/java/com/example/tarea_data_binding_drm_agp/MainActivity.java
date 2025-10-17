package com.example.tarea_data_binding_drm_agp;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1, etNumber2;
    private TextView tvResult;
    private Button btnSumar, btnRestar, btnMultiplicar, btnDividir;
    private ImageView imageView;
    private CalculatorModel calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular vistas manualmente (sin Data Binding)
        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        tvResult = findViewById(R.id.tvResult);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        imageView = findViewById(R.id.imageView);

        // Crear instancia del modelo
        calculator = new CalculatorModel();

        // Asignar listeners a los botones
        View.OnClickListener listener = v -> operar(v.getId());
        btnSumar.setOnClickListener(listener);
        btnRestar.setOnClickListener(listener);
        btnMultiplicar.setOnClickListener(listener);
        btnDividir.setOnClickListener(listener);
    }

    @SuppressLint("NonConstantResourceId")
    private void operar(int id) {
        try {
            double num1 = Double.parseDouble(etNumber1.getText().toString());
            double num2 = Double.parseDouble(etNumber2.getText().toString());
            double resultado = 0;

            // Usamos if/else en lugar de switch para evitar errores
            if (id == R.id.btnSumar) {
                resultado = calculator.sumar(num1, num2);
            } else if (id == R.id.btnRestar) {
                resultado = calculator.restar(num1, num2);
            } else if (id == R.id.btnMultiplicar) {
                resultado = calculator.multiplicar(num1, num2);
            } else if (id == R.id.btnDividir) {
                resultado = calculator.dividir(num1, num2);
            }

            tvResult.setText("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor ingresa números válidos", Toast.LENGTH_SHORT).show();
        } catch (IllegalArgumentException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}




