package com.example.projetoaula3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variáveis recebem o tipo dos objetos e seus atributos
        val numeroEscolhido = findViewById<EditText>(R.id.edit_numero)
        val btnRodarNumero = findViewById<Button>(R.id.btn_rodar)
        val textoNenhumNumero = findViewById<TextView>(R.id.txt_nenhum_numero)
        val textoEscolhido = findViewById<TextView>(R.id.txt_numero_escolhido)
        val textoNumeroSorteado = findViewById<TextView>(R.id.txt_resultado)
        val resultado = findViewById<TextView>(R.id.txt_ganhou_ou_perdeu)

        // Função que valida se o valor informado não é vazio e está entre 0 até 10
        fun validaValor(valorInformado: String) : Boolean{
            // Variável auxiliar
            val campoValidado: Boolean
            // Valida se não é vazio
            if (valorInformado != ""){
                // Converte o valor para inteiro
                val numeroInformado = valorInformado.toInt()
                // Valida se está entre 0 e 10
                if(numeroInformado in 0..10){
                    campoValidado = true
                } else{
                    // Altera o campo numero escolhido para inválido
                    textoEscolhido.setText("Inválido")
                    resultado.setText("")
                    campoValidado = false
                }
            } else {
                textoEscolhido.setText("Inválido")
                resultado.setText("")
                campoValidado = false
            }
            // Retorna true se o valor nao for nulo e estive entre 0 e 10 senão retorna false
            return campoValidado
        }

        // Compara os dois valores recebidos por parâmetro e informa se é igual ou não
        fun comparaValores(valorSorteado: String, valorInformado: String) {
                // Compara os dois valores e altera o resultado através do txt_numero_escolhido
                if (valorSorteado == valorInformado){
                    resultado.setText("Você ganhou!!")
                    resultado.setTextColor(Color.GREEN)
                } else {
                    resultado.setText("Você perdeu!!")
                    resultado.setTextColor(Color.RED)
                }
            }

            // Aguarda o btnRodarNumero ser clicado para executar o bloco de código
            btnRodarNumero.setOnClickListener{
                // Sorteia um número de 0 até 10 e atribui na variável
                val numeroSorteado = Random().nextInt(11)
                // Informa o número através do TextView
                textoNenhumNumero.setText(R.string.numero_sorteado)

                // Converte os valores para String e troca os valores dos TextView
                textoNumeroSorteado.text = numeroSorteado.toString()
                textoEscolhido.text = numeroEscolhido.text.toString()

                // Chama função para validar valor
                val validador = validaValor(numeroEscolhido.text.toString())
                if (validador == true){
                    // Chama função para comparar os números
                    comparaValores(numeroSorteado.toString(), numeroEscolhido.text.toString())
                }




            }

    }
}