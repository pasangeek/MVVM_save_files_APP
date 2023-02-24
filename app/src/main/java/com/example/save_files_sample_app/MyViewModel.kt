package com.example.save_files_sample_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val _savedText =MutableLiveData<String>(null)
    val savedText:LiveData<String>
    get() = _savedText

}