package com.example.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var mCounter: Int = 0;
    private var status: Boolean = true;
    private var mgs: String = "Disable"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<TextView>(R.id.vt)
        var bl1 = findViewById<Button>(R.id.bt)
        var bl2 = findViewById<Button>(R.id.bt2)
        var bl3 = findViewById<Button>(R.id.bt3)

        bl1.setOnClickListener {
            bl2.isEnabled = !status
            status = !status
            if(mgs == "Disable"){
                bl1.setText("Enabled")
                mgs = "Enabled"
            }
            else {
                bl1.setText("Disable")
                mgs = "Disable"
            }

        }

        bl2.setOnClickListener {
            mCounter++
            tv.setText("Button Clicked $mCounter times")
        }

        bl3.setOnClickListener {
            mCounter = 0;
            tv.setText("Button Clicked $mCounter times")
        }
    }
}