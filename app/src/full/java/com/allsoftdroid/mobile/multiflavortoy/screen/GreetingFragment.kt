package com.allsoftdroid.mobile.multiflavortoy.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.allsoftdroid.mobile.multiflavortoy.R

class GreetingFragment : Fragment() {
    companion object {
        fun getGreetings(): String {
            return "This is Full version"
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_greeting,container,false)
        view.findViewById<TextView>(R.id.tv_greeting_message).apply {
            text = getGreetings()
        }
        return view
    }
}