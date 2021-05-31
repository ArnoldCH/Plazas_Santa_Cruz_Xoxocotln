package com.example.plazas_santa_cruz_xoxocotln

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CalcularArea(view: View) {
        var rad:Int =Integer.parseInt(findViewById<EditText>(R.id.txtRadio).text.toString())
        var res= ((rad * rad) * 3.1416) - 21.9912
        if (rad>=100){
            if (rad<=300){
                findViewById<TextView>(R.id.txtResultado).text = "El área de pasto es $res m^2"
                Toast.makeText(this, "¡Listo!", Toast.LENGTH_LONG).show()
            }else {
                findViewById<TextView>(R.id.txtResultado).text = "El área de pasto es"
                Toast.makeText(this, "El área es mayor a 300 m", Toast.LENGTH_LONG).show()
            }

        } else{
            findViewById<TextView>(R.id.txtResultado).text = "El área de pasto es"
            Toast.makeText(this, "El área es menor a 100 m", Toast.LENGTH_LONG).show()
        }

        /* //Código 2
        when(rad){
            in 100..300 -> {
                findViewById<TextView>(R.id.txtResultado).text = "El área de pasto es $res m^2"
                Toast.makeText(this, "¡Listo!", Toast.LENGTH_LONG).show()
            }
            else -> {
                findViewById<TextView>(R.id.txtResultado).text = "El área de pasto es"
                Toast.makeText(this, "El área es menor a 100 m", Toast.LENGTH_LONG).show()
            }
        }
        */

    }
}