package com.example.save_files_sample_app

import android.content.Context


import java.io.File


class FileSaver(val context: Context) {
    private val fileName: String = "my_file"
    var fileContent: String = ""

    fun writeToFile(content: String) {
        fileContent = content
        context.openFileOutput(fileName, Context.MODE_PRIVATE).use {
            it.write(fileContent.toByteArray())
        }

    }



    fun readFromFile(): String =

        File(context.filesDir, fileName).readText()


}