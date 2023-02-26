package com.example.save_files_sample_app


import androidx.databinding.Bindable


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private val _savedText = MutableLiveData<String>(null)
    //private val _readText = MutableLiveData<String>(null)

    val savedText: LiveData<String>
        get() = _savedText

    @get:Bindable
    var typedtext: String = ""

    fun upadateFrommsaveText(savedText: String) {

        _savedText.value = savedText

    }

    // fun performReadText(readText:String)
    // {
    //    _readText.value= readText

    // }


}