package com.example.denis.secondlab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Button
//import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Double.parseDouble


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val normal = findViewById<Button>(R.id.button4)
        button.setOnClickListener {


            val s1 = editText1.text.toString();
            val s2 = editText2.text.toString();

            val a = parseDouble(s1);
            val b = parseDouble(s2);

            val c = a + b;

            val s = c.toString();

            textView.text = s;
        }
        button2.setOnClickListener {


            val s1 = editText1.text.toString();
            val s2 = editText2.text.toString();

            val a = parseDouble(s1);
            val b = parseDouble(s2);

            val c = a - b;

            val s = c.toString();

            textView.text = s;
        }
        button3.setOnClickListener {


            val s1 = editText1.text.toString();
            val s2 = editText2.text.toString();

            val a = parseDouble(s1);
            val b = parseDouble(s2);

            val c = a * b;

            val s = c.toString();

            textView.text = s;
        }
        button4.setOnClickListener {


            val s1 = editText1.text.toString();
            val s2 = editText2.text.toString();

            val a = parseDouble(s1);
            val b = parseDouble(s2);

            if (b == 0.0) {
                Snackbar.make(normal, "Nononono", 10).show();

            } else {
                val c = a / b;

                val s = c.toString();

                textView.text = s;
            }
        }


    }
}
