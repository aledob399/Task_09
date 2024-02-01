package com.example.task_09

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.view.ViewCompat


class MainActivity : AppCompatActivity() {

    private lateinit var btnNavigation: Button
    private lateinit var btnCalendar: Button
    private lateinit var btnWeather: Button
    private lateinit var btnMicro: ImageButton
    private lateinit var btnMail: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNavigation=findViewById(R.id.btnNavigation)
        btnCalendar=findViewById(R.id.btnCalendar)
        btnWeather=findViewById(R.id.btnWeather)
        btnMicro=findViewById(R.id.btnMicrofono)
        btnMail=findViewById(R.id.btnMail)

        btnNavigation.setOnClickListener {
            agregarBoton("Ha accedido a google maps")
        }


    }

    @SuppressLint("ResourceType")
    private fun agregarBoton(texto: String) {
        val nuevoBoton = Button(this)
/*
        nuevoBoton.layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
        nuevoBoton.layoutParams.height = resources.getDimensionPixelSize(R.dimen.button_height)
        nuevoBoton.setBackgroundResource(R.style.Widget_MaterialComponents_Button_OutlinedButton) // Nose si esta bien...
        nuevoBoton.setPadding(
            resources.getDimensionPixelSize(R.dimen.button_padding),
            resources.getDimensionPixelSize(R.dimen.button_padding),
            resources.getDimensionPixelSize(R.dimen.button_padding),
            resources.getDimensionPixelSize(R.dimen.button_padding)
        )
        nuevoBoton.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#ffffff"))
        nuevoBoton.elevation = resources.getDimensionPixelSize(R.dimen.button_elevation).toFloat()
        nuevoBoton.shadowColor = Color.parseColor("#5C5C5C")
        nuevoBoton.text = texto
        nuevoBoton.setTextColor(Color.parseColor("#000000"))
        nuevoBoton.setTextSize(16f)


        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        linearLayout.addView(nuevoBoton)
*/
    }
}