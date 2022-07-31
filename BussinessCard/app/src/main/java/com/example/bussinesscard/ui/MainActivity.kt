package com.example.bussinesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bussinesscard.R
import com.example.bussinesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by  lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}