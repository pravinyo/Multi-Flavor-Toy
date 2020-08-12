package com.allsoftdroid.mobile.multiflavortoy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.allsoftdroid.mobile.multiflavortoy.screen.GreetingFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        findViewById<TextView>(R.id.text).apply {
            text = GreetingFragment.getGreetings()
        }
    }
}