package com.example.testdeliciouslyvincent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void showTuto(View view) {
        //lancement de TutoActivity (page de Tuto)
        Intent intentTuto = new Intent(HomeActivity.this,TutoActivity.class);

        startActivity(intentTuto);

    }

    public void showProfil(View view) {
        //lancement de ProfilActivity (page de profil)
        Intent intentProfil = new Intent(HomeActivity.this,ProfilActivity.class);

        startActivity(intentProfil);
    }

    public void showRemarques(View view) {
        //lancement de HomeActivity (page de remarques)
        Intent intentRemarques = new Intent(HomeActivity.this,RemarquesActivity.class);

        startActivity(intentRemarques);
    }
}