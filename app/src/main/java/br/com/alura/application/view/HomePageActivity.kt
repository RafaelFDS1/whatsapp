package br.com.alura.application.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import br.com.alura.application.R
import br.com.alura.application.view.fragments.CallFragment
import br.com.alura.application.view.fragments.ChatFragment
import br.com.alura.application.view.fragments.CommFragment
import br.com.alura.application.view.fragments.StatusFragment

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_options, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        when(item.itemId) {
            R.id.search_item_home -> {
                searchOption()
                true
            }
            R.id.camera_item_home -> {
                cameraOption()
                true
            }
            R.id.config_item_home -> {
                configOption()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    // TODO: Criar o mecanismo de Search (Activity e pesquisa de conversas)
    fun searchOption() = Toast.makeText(this, "Search option to be implemented", Toast.LENGTH_SHORT)

    // TODO: Criar o mecanismo de acesso a camera (Activity para acesso a câmera)
    fun cameraOption() = Toast.makeText(this, "Camera option to be implemented", Toast.LENGTH_SHORT)

    // TODO: Criar o mecanismo de configuração de usuário (Activity de configuração)
    fun configOption() = Toast.makeText(this, "Config option to be implemented", Toast.LENGTH_SHORT)

}