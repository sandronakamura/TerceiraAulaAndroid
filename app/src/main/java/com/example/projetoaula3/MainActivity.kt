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

        // Atribuindo as propriedades do botão rodar a variável btnRodarNumero
        val btnRodarNumero = findViewById<Button>(R.id.btn_rodar)

            // Aguarda o click no botão para rodar o bloco de código
            btnRodarNumero.setOnClickListener{
                // Atribuindo as propriedades do textView nas variáveis
                val texto = findViewById<TextView>(R.id.txt_nenhum_numero)
                val resultado = findViewById<TextView>(R.id.txt_resultado)

                // Gerando um número aleatório de 0 até 10
                val numeroSorteado = Random().nextInt(11)

                // Alterando o texto do textView do resultado com o valor sorteado

                texto.setText(R.string.numero_sorteado)
                resultado.text = numeroSorteado.toString()

            }

    }
}