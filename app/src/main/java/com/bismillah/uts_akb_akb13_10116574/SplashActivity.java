package com.bismillah.uts_akb_akb13_10116574;

// NIM : 10116574
// NAMA : IRA YUTI
// KELAS : AKB13
// TANGGAL PENGERJAAN : 20 MEI 2019

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // langsung pindah ke MainActivity atau activity lain
        // begitu memasuki splash screen ini
        Intent intent = new Intent(SplashActivity.this, IntroActivity.class);
        startActivity(intent);
        finish();
    }

}


