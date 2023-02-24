package com.example.save_files_sample_app

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.File

class FileSaver(context: Context)  {

    private  val pref_TEXTS = "SharedPref"
    private val KEY_TEXTS = "TEXTS"
    private val sharedPref = context.getSharedPreferences("pref_TEXTS ", Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor=sharedPref.edit()

fun writeToFile(dataToSave:String) =editor.putString(KEY_TEXTS,pref_TEXTS).commit()


    fun readFromFile():String{

return ""
    }
}