package com.example.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
class ColorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_blank, container, false).apply {
        setOnClickListener {
            setBackgroundColor(Color.parseColor(
                arrayOf(
                    "red", "cyan", "magenta", "green", "yellow", "black"
                ).random()
            ))
        }
    }
}