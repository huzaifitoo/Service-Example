package com.example.serviceexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.serviceexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            binding.btnStart.setOnClickListener {

                startService(Intent(this@MainActivity,MyService::class.java))
            }
            binding.btnStop.setOnClickListener {

                stopService(Intent(this@MainActivity,MyService::class.java))
            }
        }
    }
}