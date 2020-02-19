package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{


    lateinit var editTextName: EditText
    lateinit var button: Button
    lateinit var textViewMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        button = findViewById(R.id.button)
        textViewMessage = findViewById(R.id.button)
        button.setOnClickListener(this)


//    boton.setOnClickListener({
//        Toast.makeText(this, "Hola Ana", Toast.LENGTH_SHORT).show()
//    })
    }
    override fun onClick(view: View?) {
        val name = editTextName.text
        textViewMessage.text = "Hello $name"
    }
}
