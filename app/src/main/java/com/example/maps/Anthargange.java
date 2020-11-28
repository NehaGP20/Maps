package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anthargange extends AppCompatActivity implements View.OnClickListener{
    Button btnDetail,btnLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anthargange);
        btnDetail = (Button)findViewById(R.id.btn_details);
        btnLoc = (Button)findViewById(R.id.btn_loc);
        btnDetail.setOnClickListener(this);
        btnLoc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.equals(btnDetail)) {
            Intent it = new Intent(Anthargange.this, PackDetails.class);
            startActivity(it);
        }
        else if(v.equals(btnLoc)) {
            Intent it1 = new Intent(Anthargange.this,MapsActivity.class);
            startActivity(it1);
        }

    }
}
