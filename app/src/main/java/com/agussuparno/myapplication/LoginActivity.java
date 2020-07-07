package com.agussuparno.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void loginproses(String username, String passwd){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", username);
        editor.putString("password", passwd);
        editor.putBoolean("sudahlogin", true);
        editor.apply();
        //jalankan MainActivity
        Intent utama = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(utama);
        finish();
    }
}
