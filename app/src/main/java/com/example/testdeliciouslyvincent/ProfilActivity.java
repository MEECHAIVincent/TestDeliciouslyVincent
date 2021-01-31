package com.example.testdeliciouslyvincent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfilActivity extends AppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        //TODO : code spécifique
    }

    public void backHome(View view) {
        //Retour à la page d'accueil
        ProfilActivity.this.finish();
    }
}