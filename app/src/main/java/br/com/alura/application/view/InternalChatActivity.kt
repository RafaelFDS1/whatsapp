package br.com.alura.application.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.alura.application.R

class InternalChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internal_chat)
        val bundle = intent.extras
        val numero = bundle!!.getString("numero")?:"Vazio"

        findViewById<TextView>(R.id.textView_internal).text = "Bem vindo a conversa com o numero $numero"

    }
}