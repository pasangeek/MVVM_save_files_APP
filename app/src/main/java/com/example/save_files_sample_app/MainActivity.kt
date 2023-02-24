package com.example.save_files_sample_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.save_files_sample_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val viewModel: MyViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        //Data binding
binding.myVM = viewModel
        binding.buttonsave.setOnClickListener {



        }
    }
}