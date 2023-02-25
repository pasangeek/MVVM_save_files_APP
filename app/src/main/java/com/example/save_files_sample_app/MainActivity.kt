package com.example.save_files_sample_app

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
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
        binding.lifecycleOwner = this
        binding.buttonsave.setOnClickListener {
           // viewModel.performsaveText (FileSaver(this).writeToFile(viewModel.savedText.value.toString())
           // viewModel.performsaveText(binding.editTextTextPersonName.text.toString())
            FileSaver(this).writeToFile(viewModel.savedText.value.toString())
        }


        binding.button2view.setOnClickListener {

          viewModel.performsaveText(FileSaver(this).readFromFile())

        }
    }
}