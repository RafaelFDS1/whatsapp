package br.com.alura.application.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import br.com.alura.application.R
import br.com.alura.application.model.Chat
import br.com.alura.application.view.fragments.CallFragment
import br.com.alura.application.view.fragments.ChatFragment
import br.com.alura.application.view.fragments.CommFragment
import br.com.alura.application.view.fragments.StatusFragment
import java.time.LocalDate
import java.util.*

class HomePageActivity : AppCompatActivity(R.layout.activity_home_page) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<ChatFragment>(R.id.fragmentContainerView)
        }

        val chat = findViewById<Button>(R.id.chat_view)
        val chamadas = findViewById<Button>(R.id.call_view)
        val status = findViewById<Button>(R.id.status_view)
        val comm = findViewById<Button>(R.id.comm_view)

        if (savedInstanceState == null) {
            btn_settings(chat, chamadas, status, comm)
        }
    }

    fun btn_settings(
        chat: Button,
        chamadas: Button,
        status: Button,
        comm: Button
    ) {
        chat.setOnClickListener {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<ChatFragment>(R.id.fragmentContainerView)
            }
        }
        chamadas.setOnClickListener {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<CallFragment>(R.id.fragmentContainerView)
            }
        }
        status.setOnClickListener {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<StatusFragment>(R.id.fragmentContainerView)
            }
        }
        comm.setOnClickListener {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<CommFragment>(R.id.fragmentContainerView)
            }
        }
    }
}