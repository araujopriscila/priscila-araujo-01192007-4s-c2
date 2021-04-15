package com.example.continuadadois

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun comprar(view: View) {

        val conexaoCachorro = Conexao.criar()
        val etCachorro1: EditText = findViewById(R.id.et_cachorroUm)
        val Cachorro1 = etCachorro1.text.toString().toInt()

        val etCachorro2: EditText = findViewById(R.id.et_cachorroDois)
        val Cachorro2 = etCachorro2.text.toString().toInt()

        var mensagemCachorroPerdido1: String = "";
        var racaCachorro1: String = "";
        var precoCachorro1: Int = 0;

        var mensagemCachorroPerdido2: String = "";
        var racaCachorro2: String = "";
        var precoCachorro2: Int = 0;


        }
}