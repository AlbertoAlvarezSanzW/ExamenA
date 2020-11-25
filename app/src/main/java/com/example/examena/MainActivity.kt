package com.example.examena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit1 = findViewById<EditText>(R.id.editT)
        val boton1 = findViewById<Button>(R.id.button)
        boton1.setEnabled(false)
        /*He conseguido hacer si se meten 4 espacios en blanco seguidos*/
        edit1.addTextChangedListener(object: TextWatcher {
            override fun onTextChanged(s:CharSequence, start:Int, before:Int, count:Int) {
                var w:Int =0
                for (i in s) {
                    if (s.isBlank())
                        w++
                }
                if (w==4) {
                    boton1.setEnabled(true)
                } else {
                    boton1.setEnabled(false)
                }
            }
            override fun beforeTextChanged(s:CharSequence, start:Int, count:Int,after:Int) {
            }
            override fun afterTextChanged(s: Editable) {
            }
        })

        
    }
}