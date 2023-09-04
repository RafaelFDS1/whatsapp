package br.com.alura.application.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import br.com.alura.application.R
import br.com.alura.application.controller.UserDTO

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_login)
        setSignInBtn()

        val btn = findViewById<TextView>(R.id.clickText)
        btn.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

    }
    fun setSignInBtn() {
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val dto = UserDTO()
            val number = findViewById<EditText>(R.id.number).text.toString()
            val password = findViewById<EditText>(R.id.password).text.toString()
            dto.getUser(number){ user ->
                println("Usuário retornado: $user")
                if (user == null) {
                    Toast.makeText(this, "Login ainda não cadastrado.", Toast.LENGTH_SHORT).show()
                } else {
                    if (user.numero == number && user.password == password) {
                        startActivity(Intent(this, HomePageActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(this, "Login ou password não condizentes.", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }
        }
    }
}