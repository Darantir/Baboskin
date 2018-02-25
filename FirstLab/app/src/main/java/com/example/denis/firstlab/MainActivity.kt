package com.example.denis.firstlab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        Toast.makeText(this, "onDestroy!", 6).show();
        super.onDestroy()
    }

    override fun onStart() {
        Toast.makeText(this, "onStart!", 6).show();
        super.onStart()
    }

    override fun onPause() {
        Toast.makeText(this, "onPause!", 6).show();
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(this, "onStop!", 6).show();
        super.onStop()
    }
}
