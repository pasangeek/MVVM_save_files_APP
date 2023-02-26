package com.example.save_files_sample_app

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.save_files_sample_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val viewModel: MyViewModel by viewModels()
    val fileName: String = "tt"

    // private lateinit var viewModel: MyViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


        // binding
        binding.myVM = viewModel
        binding.lifecycleOwner = this
        binding.buttonsave.setOnClickListener {

            //viewModel.upadateFrommsaveText(binding.editTextTextPersonName.text.toString())

            FileSaver(this).writeToFile(fileName, viewModel.typedtext)


        }


        binding.button2view.setOnClickListener {
            val dataRetrived = FileSaver(this).readFromFile(fileName)
            viewModel.upadateFrommsaveText(dataRetrived)

        }
    }
}