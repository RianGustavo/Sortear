package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextInicial, editTextFinal;
    TextView textViewResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInicial = findViewById(R.id.editTextInicial);
        editTextFinal = findViewById(R.id.editTextFinal);
        textViewResultado = findViewById(R.id.textViewResultado);
    }
    public void sortear(View view){
        int Vinicial = Integer.parseInt(editTextInicial.getText().toString());
        int Vfinal = Integer.parseInt(editTextFinal.getText().toString());
        int resultado = (int) ((Math.random()*(Vfinal-Vinicial))+Vinicial);
        textViewResultado.setText(Integer.toString(resultado));


    }
}
