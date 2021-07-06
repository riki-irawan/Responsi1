package com.example.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RecoveryActivity : AppCompatActivity() {
        ActionBar actionBar;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        actionBar = supportActionBar();
        supportActionBar().setDisplayHomeAsUpEnabe(true);
    }
    public boolean onsupportNavigation
}