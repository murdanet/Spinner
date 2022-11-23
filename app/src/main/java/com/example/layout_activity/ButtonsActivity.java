package com.example.layout_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ButtonsActivity extends AppCompatActivity {

    RadioButton rbOpcio1;
    RadioButton rbOpcio2;
    RadioButton rbOpcio3;

    CheckBox argentina;
    CheckBox españa;
    CheckBox brasil;
    CheckBox inglaterra;

    TextView texto;


    String texto1="",texto2="",texto3="", texto4="", texto5 ="";


    TextView checkbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        argentina = findViewById(R.id.argentina);
        españa = findViewById(R.id.españa);
        brasil = findViewById(R.id.brasil);
        inglaterra = findViewById(R.id.inglaterra);

        rbOpcio1=findViewById(R.id.rbOpcio1);
        rbOpcio2=findViewById(R.id.rbOpcio2);
        rbOpcio3=findViewById(R.id.rbOpcio3);

        texto= findViewById(R.id.textView4);

        checkbox = findViewById(R.id.textView3);


    }

    public void boton1(View view){
        if (argentina.isChecked()==true)
            texto1="obviamente\n";
        else
            texto1=" ";

        texto.setText(texto1+texto2+texto3+texto4);


    }

    public void boton2(View view){
        if (españa.isChecked()==true)
            texto2="luis padrique\n";
        else
            texto2=" ";

        texto.setText(texto1+texto2+texto3+texto4);

    }

    public void boton3(View view){
        if (brasil.isChecked()==true)
            texto3="No va a pasar\n";
        else
            texto3=" ";

        texto.setText(texto1+texto2+texto3+texto4);

    }

    public void boton4(View view){
        if (inglaterra.isChecked()==true)
            texto4="Nao nao naooooooo\n";
        else
            texto4=" ";

        texto.setText(texto1+texto2+texto3+texto4);

    }

    public void opcion1(View view){
        if (rbOpcio1.isChecked()==true)
            texto5="En algunas culturas lo es";
        else
            texto5=" ";

        checkbox.setText(texto5);

    }

    public void opcion2(View view){
        if (rbOpcio2.isChecked()==true)
            texto5="En algunas culturas lo es";
        else
            texto5=" ";

        checkbox.setText(texto5);

    }

    public void opcion3(View view){
        if (rbOpcio3.isChecked()==true)
            texto5="EL SALVADOR DEFINITIVO DEL UNIVERSO";
        else
            texto5=" ";

        checkbox.setText(texto5);

    }




}


