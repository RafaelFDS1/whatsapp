package br.com.alura.application.ui.activities

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

    // TODO: Problema com o action bar, retona nulo independente da situação.

    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.internal_chat, menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//
//
////  TODO: Criação do botão de return do Action Bar
//    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
//        android.R.id.home -> {
//            finish()
//            true
//        }
//        else -> super.onOptionsItemSelected(item)
//    }
}