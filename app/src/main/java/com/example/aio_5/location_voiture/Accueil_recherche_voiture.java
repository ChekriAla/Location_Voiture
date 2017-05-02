package com.example.aio_5.location_voiture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil_recherche_voiture extends AppCompatActivity {

    private Button btn2;
    private Button btn6;
    private Button btn;
    private Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_recherche_voiture);

        btn2 = (Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent siActivite = new Intent(Accueil_recherche_voiture.this, Recherche_voiture_agence.class);
                startActivity(siActivite);
            }
        });



        btn6 = (Button) findViewById(R.id.button6);

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent huitActivite = new Intent(Accueil_recherche_voiture.this, List_tout_voiture.class);
                startActivity(huitActivite);
            }
        });

        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent neufActivite = new Intent(Accueil_recherche_voiture.this, Recherche_par_marque.class);
                startActivity(neufActivite);
            }
        });

        btn5 = (Button) findViewById(R.id.button5);

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent onzeActivite = new Intent(Accueil_recherche_voiture.this, Recherche_par_prix.class);
                startActivity(onzeActivite);
            }
        });


    }
}
