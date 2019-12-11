package com.example.otomaiddroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Select extends AppCompatActivity {
    RadioGroup seleccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }

    public void seleccionar(View view){
        seleccion = findViewById(R.id.seleccion);
        RadioButton seleccionado = (RadioButton) seleccion.getChildAt(seleccion.indexOfChild(seleccion.findViewById(seleccion.getCheckedRadioButtonId())));
        toastear("Selected:" + seleccionado.getText());
    }

    public void toastear(String mensaje){
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
}
