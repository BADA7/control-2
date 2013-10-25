package com.example.androidcontrol2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RatingBar;
import android.view.View;
import android.view.View.OnClickListener;

public class UnoActivity extends Activity {

		private EditText EditN, EditE;
	    private Button Bot;
	    private RatingBar Barrr;

	    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_uno);
            
            EditN = (EditText) findViewById(R.id.nombre);
            EditE = (EditText) findViewById(R.id.email);
            Bot = (Button) findViewById(R.id.button_send);
            Barrr = (RatingBar) findViewById(R.id.RatingBar);
            
            Bot.setOnClickListener(new OnClickListener() {
            	 @Override
                 public void onClick(View v) {
                         Intent i = new Intent(UnoActivity.this, DosActivity.class);
                         i.putExtra("nombre", EditN.getText()+""); 
                         i.putExtra("correo", EditE.getText()+"");
                         i.putExtra("rating", Barrr.getRating());
                         startActivity(i);
                         
                    }
         });        
         
}
}
