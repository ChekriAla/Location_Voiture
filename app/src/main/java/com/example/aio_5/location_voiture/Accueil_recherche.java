package com.example.aio_5.location_voiture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil_recherche extends AppCompatActivity {
    private Button btn;
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_recherche);
        btn = (Button) findViewById(R.id.bc);
        btn1 = (Button) findViewById(R.id.button4);
        btn2 = (Button) findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent thirdActivite = new Intent(Accueil_recherche.this, Presentation_service.class);
                startActivity(thirdActivite);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent fourActivite = new Intent(Accueil_recherche.this, List_agence.class);
                startActivity(fourActivite);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent fiveActivite = new Intent(Accueil_recherche.this, Accueil_recherche_voiture.class);
                startActivity(fiveActivite);
            }
        });

    }
}
