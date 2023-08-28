package br.com.alura.application.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import br.com.alura.application.R
import br.com.alura.application.model.User
import br.com.alura.application.model.UserDTO

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_login)
        UserDTO.user = User(nome = "Rafael", login = "adm", password = "1234")
        setSignInBtn()

        val btn = findViewById<TextView>(R.id.clickText)
        btn.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

    }

    fun setSignInBtn() {
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val login = findViewById<EditText>(R.id.login)
            val password = findViewById<EditText>(R.id.password)
            if (UserDTO.user == null) {
                Toast.makeText(this, "Login ainda não cadastrado.", Toast.LENGTH_SHORT).show()
            } else {
                if (UserDTO.user!!.login == login.text.toString() && UserDTO.user!!.password == password.text.toString()) {
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