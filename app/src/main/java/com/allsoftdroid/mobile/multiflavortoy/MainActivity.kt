package com.allsoftdroid.mobile.multiflavortoy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.allsoftdroid.mobile.multiflavortoy.screen.GreetingFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer,GreetingFragment(),"greeting")
            .commit()
    }
}