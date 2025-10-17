package com.example.tarea_data_binding_drm_agp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


import com.example.tarea_data_binding_drm_agp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private CalculatorModel calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflar el layout con Data Binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Instanciar el modelo
        calculator = new CalculatorModel();

        // Asignar listeners a los botones
        binding.btnSumar.setOnClickListener(v -> operar("+"));
        binding.btnRestar.setOnClickListener(v -> operar("-"));
        binding.btnMultiplicar.setOnClickListener(v -> operar("*"));
        binding.btnDividir.setOnClickListener(v -> operar("/"));
    }

    private void operar(String operacion) {
        try {
            // Obtener los números desde los EditText
            double num1 = Double.parseDouble(binding.etNumber1.getText().toString());
            double num2 = Double.parseDouble(binding.etNumber2.getText().toString());
            double resultado = 0;

            // Lógica de operaciones usando el modelo
            switch (operacion) {
                case "+":
                    resultado = calculator.sumar(num1, num2);
                    break;
                case "-":
                    resultado = calculator.restar(num1, num2);
                    break;
                case "*":
                    resultado = calculator.multiplicar(num1, num2);
                    break;
                case "/":
                    resultado = calculator.dividir(num1, num2);
                    break;
            }

            // Mostrar el resultado
            binding.tvResult.setText("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor ingresa números válidos", Toast.LENGTH_SHORT).show();
        } catch (IllegalArgumentException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
