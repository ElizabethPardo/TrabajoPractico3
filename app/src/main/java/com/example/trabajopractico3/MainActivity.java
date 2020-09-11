package com.example.trabajopractico3;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbDolarAEuro;
    private RadioButton rbEuroADolar;
    private EditText etDolar;
    private EditText etEuro;
    private EditText cambio;
    private Button convertir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversor);

     rbDolarAEuro=findViewById(R.id.rbDólaresAEuros);
     rbEuroADolar=findViewById(R.id.rbEurosADolares);
     etDolar=findViewById(R.id.etDolares);
     etEuro=findViewById(R.id.etEuros);
     cambio=findViewById(R.id.etCambio);
    convertir=findViewById(R.id.btnConvertir);
    }

    public void cambiarEstado(View view)
    {
      etDolar.setText("");
      etEuro.setText("");
      cambio.setText("");

      if(view.getId() == rbDolarAEuro.getId()){

          etDolar.setEnabled(true);
          etDolar.requestFocusFromTouch();

          etEuro.setEnabled(false);
          rbEuroADolar.setChecked(false);
      }
      else{
          etEuro.setEnabled(true);
          etEuro.requestFocusFromTouch();

          etDolar.setEnabled(false);
          rbDolarAEuro.setEnabled(false);
      }

    }

    public void conversor(View v)
    {
        if(rbDolarAEuro.isChecked())
        {
            double dolares =Double.valueOf(etDolar.getText().toString());
            String res=String.valueOf(dolares * 0.85) + "Euros";
            cambio.setText(res);
        }
        else
            {
                double euros=Double.valueOf(etEuro.getText().toString());
                String res= String.valueOf(euros*1.18)+ "Dolares";
                cambio.setText(res);
            }


    }
}