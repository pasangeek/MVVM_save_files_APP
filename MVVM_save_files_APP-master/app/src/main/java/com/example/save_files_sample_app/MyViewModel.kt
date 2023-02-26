package com.example.save_files_sample_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val _saveText =MutableLiveData<String>(null)
    val savedText:LiveData<String>
    get() = _saveText
    @get:Bindable
    var typedtext: String = ""

    fun performsaveText(savedText:String) {

    _saveText.value= savedText

}



}