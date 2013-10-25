package com.example.androidcontrol2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class DosActivity extends Activity {

	 private TextView textNom, textCorr;
     private RatingBar resultadoR;
     String nombre,correo;
     
     @Override
     protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_dos);
             
             
             textNom = (TextView) findViewById(R.id.textN);
             textCorr = (TextView) findViewById(R.id.textE);
             resultadoR = (RatingBar) findViewById(R.id.resultRatingBar);
             
             nombre = getIntent().getStringExtra("nombre");
             correo = getIntent().getStringExtra("correo");
             Float rating = getIntent().getFloatExtra("rating", 0);

             textNom.setText(nombre);
             textCorr.setText(correo);
             resultadoR.setRating(rating);
             
             
             
             
             
             
                    
             
     }

}
