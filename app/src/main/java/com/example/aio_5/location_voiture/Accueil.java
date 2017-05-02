package com.example.aio_5.location_voiture;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity {
MediaPlayer mySound;
    private Button btn;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
		
		 mySound = MediaPlayer.create(this,R.raw.car);

        btn = (Button) findViewById(R.id.bs);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mySound.start();
                Intent secondeActivite = new Intent(Accueil.this, Accueil_recherche.class);
                startActivity(secondeActivite);
            }
        });
		
    }
}
