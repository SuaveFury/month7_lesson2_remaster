package com.example.month7_lesson2_remaster.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.month7_lesson2_remaster.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}