package com.example.aio_5.location_voiture;

import android.net.Uri;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;



public class CustomAdapterr extends ArrayAdapter<String> {

    CustomAdapterr(Context context,String[] foods){
        super(context,R.layout.custom_row,foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater buckysInflater = LayoutInflater.from(getContext());
        View customView  = buckysInflater.inflate(R.layout.custom_row,parent,false);

        String singleFoodItem = getItem(position);
        TextView buckyText = (TextView) customView.findViewById(R.id.buckysText);
        ImageView buckysImage=(ImageView) customView.findViewById(R.id.buckysImage);

        buckyText.setText(singleFoodItem);
        buckysImage.setImageResource(R.drawable.rent);

        return customView;
    }
}
