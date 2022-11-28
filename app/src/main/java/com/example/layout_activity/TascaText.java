package com.example.layout_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TascaText extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasca_text);
        EditText nombre = (EditText) findViewById(R.id.etxt_nombre);
        SpannableString mitexto = new SpannableString("Escribe tu nombre ");
        StyleSpan boldspan1 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldspan2 = new StyleSpan(Typeface.BOLD);
        mitexto.setSpan(boldspan1,11,17,Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mitexto.setSpan(boldspan2,18,mitexto.length(),Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        nombre.setText(mitexto);


        TextView datos = (TextView) findViewById(R.id.txt_TD);
        SpannableString textos = new SpannableString ("LA FIFA está especialmente sensibilizada" +
                " en la protección de los datos de los USUARIOS de los servicios a los que se accede a través de su web." +
                " Mediante la presente Política de Privacidad (en adelante , la Política) LA FIFA informa a los " +
                "USUARIOS del sitio web: (VUESTROS DATOS)del tratamiento " +
                "y usos a los que se someten los datos de carácter personal que se recaban en la web, con el fin de que decidan, libre y voluntariamente, " +
                "si desean facilitar la información solicitada.");
        StyleSpan boldspan3= new StyleSpan(Typeface.BOLD);
        StyleSpan boldspan4= new StyleSpan(Typeface.BOLD);
        textos.setSpan(boldspan3,3,7,Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textos.setSpan(boldspan4,46,86,Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        datos.setText(textos);

        ImageButton fifa = (ImageButton) findViewById(R.id.Fifa);
        fifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TascaText.this, ButtonsActivity.class);
                startActivity(i);
            }
        });


    }
}