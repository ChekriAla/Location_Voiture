package com.example.aio_5.location_voiture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class List_agence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_agence);
		
		
		String[] agences = {"Agence Mannouba \n 169 rue Ibn Kouldoun","  Agence Tunis \n 24 rue mohammed el khames"," Agence Ariana \n 11 rue el khawarezmi","Agence Ben Arous \n 64 rue najib mahfoudh " };


        ListAdapter buckysAdapter = new CustomAdapterr(this,agences);

        ListView buckysListView = (ListView) findViewById(R.id.buckysListView);
        buckysListView.setAdapter(buckysAdapter);

        buckysListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view,int position,long id){
                        String agence= String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(List_agence.this, agence, Toast.LENGTH_SHORT).show();
                    }

                }
        );
		
		
		
		
    }
}
