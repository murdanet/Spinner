package com.example.layout_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class Formulari extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {

    ListView simpleListView;
    // array objects
    String courseList[] = {"Mundial de Futbol", "Copa America,","Eurocopa"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulari);
        EditText nombre = (EditText) findViewById(R.id.etxt_nombre);
        SpannableString mitexto = new SpannableString("Escribe tu nombre ");
        StyleSpan boldspan1 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldspan2 = new StyleSpan(Typeface.BOLD);
        mitexto.setSpan(boldspan1,11,17,Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mitexto.setSpan(boldspan2,18,mitexto.length(),Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        nombre.setText(mitexto);



        simpleListView = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.item_view, R.id.itemTextView, courseList);
        simpleListView.setAdapter(arrayAdapter);


        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valores_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item );
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);












        TextView datos = (TextView) findViewById(R.id.txt_TD);
        SpannableString textos = new SpannableString ("LA FIFA está especialmente sensibilizada" +
                " en la protección de los datos de los USUARIOS de los servicios a los que se accede a través de su web." +
                " Mediante la presente Política de Privacidad (en adelante , la Política)");
        StyleSpan boldspan3= new StyleSpan(Typeface.BOLD);
        StyleSpan boldspan4= new StyleSpan(Typeface.BOLD);
        textos.setSpan(boldspan3,3,7,Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textos.setSpan(boldspan4,46,86,Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        datos.setText(textos);

        ImageButton fifa = (ImageButton) findViewById(R.id.Fifa);
        fifa.setOnClickListener(new View.OnClickListener()








        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Formulari.this, ButtonsActivity.class);
                startActivity(i);
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}