package com.example.apuestasfutbol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText jetcodigo,jetnombre,jetciudad;
    RadioButton jrbprofesional,jrbascenso,jrbaficionado;
    CheckBox jcbactivo;
    String codigo,nombre,ciudad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ocultar barra de titulo y asociar objetos Java con Xml
        getSupportActionBar().hide();
        jetcodigo=findViewById(R.id.etcodigo);
        jetnombre=findViewById(R.id.etnombre);
        jetciudad=findViewById(R.id.etciudad);
        jcbactivo=findViewById(R.id.cbactivo);
        jrbprofesional=findViewById(R.id.rbprofesional);
        jrbaficionado=findViewById(R.id.rbaficionado);
        jrbascenso=findViewById(R.id.rbascenso);
    }

    public void Adicionar(View view){
        codigo=jetcodigo.getText().toString();
        nombre=jetnombre.getText().toString();
        ciudad=jetciudad.getText().toString();


    }
}