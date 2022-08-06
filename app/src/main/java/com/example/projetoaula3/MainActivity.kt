package com.example.projetoaula3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRodarNumero = findViewById<Button>(R.id.btn_rodar)

            btnRodarNumero.setOnClickListener{
                val texto = findViewById<TextView>(R.id.txt_nenhum_numero)
                val resultado = findViewById<TextView>(R.id.txt_resultado)
                val numeroSorteado = Random().nextInt(11)
                texto.setText(R.string.numero_sorteado)
                resultado.text = numeroSorteado.toString()

            }

    }
}