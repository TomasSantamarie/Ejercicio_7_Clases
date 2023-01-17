package com.example.ejercicio_clases

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Mago = findViewById<Button>(R.id.Mago)
        Mago.setOnClickListener { cambioFoto(Mago.text.toString()) }

        var Ladron = findViewById<Button>(R.id.Ladron)
        Ladron.setOnClickListener { cambioFoto(Ladron.text.toString()) }

        var Berserker = findViewById<Button>(R.id.Berserker)
        Berserker.setOnClickListener { cambioFoto(Berserker.text.toString()) }

        var Guerrero = findViewById<Button>(R.id.Guerrero)
        Guerrero.setOnClickListener { cambioFoto(Guerrero.text.toString()) }


        findViewById<Button>(R.id.aceptar).setOnClickListener{cambioPagina()}
    }


    private fun cambioFoto(text: String) {

        val imagen = findViewById<ImageView>(R.id.imageView)

        if (text.equals("Guerrero"))
            imagen.setImageResource(R.drawable.guerrero)

        if (text.equals("Mago"))
            imagen.setImageResource(R.drawable.mago)

        if (text.equals("Berserker"))
            imagen.setImageResource(R.drawable.berserker)

        if (text.equals("Ladrón"))
            imagen.setImageResource(R.drawable.ladron)
    }
    private fun cambioPagina() {
        val intent = Intent(this, Activity::class.java)
        startActivity(intent)
    }
    }
