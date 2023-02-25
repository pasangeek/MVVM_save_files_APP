package com.example.save_files_sample_app

import android.content.Context
import android.widget.Toast


import java.io.File


class FileSaver(val context: Context) {
    private val fileName: String = "my_file"
    var fileContent: String = ""

    fun writeToFile(content: String) {
        fileContent = content
        try{
            context.openFileOutput(fileName, Context.MODE_PRIVATE).use {
                it.write(fileContent.toByteArray())
            }
            Toast.makeText(context, "Saved Successfully!", Toast.LENGTH_SHORT).show()
        }catch (exception: Exception){
            Toast.makeText(context, "Error occured while saving!", Toast.LENGTH_SHORT).show()
        }

    }



    fun readFromFile(): String {

        val readStr = File(context.filesDir, fileName).readText()
        return readStr


    }

}