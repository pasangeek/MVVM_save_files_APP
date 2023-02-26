package com.example.save_files_sample_app

import android.content.Context
import android.widget.Toast


import java.io.File


class FileSaver( context: Context) {
   
    private val mContext =context

    fun writeToFile(fileName:String,dataToSave:String) {
        mContext.openFileOutput(fileName,Context.MODE_PRIVATE).use {
            it.write(dataToSave.toByteArray())
        }

    }



    fun readFromFile(fileName: String): String  = File(mContext.filesDir, fileName).readText()





}