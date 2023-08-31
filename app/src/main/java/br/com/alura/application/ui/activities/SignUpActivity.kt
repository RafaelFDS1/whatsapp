package br.com.alura.application.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.alura.application.R
import br.com.alura.application.model.User
import br.com.alura.application.controller.UserDTO

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn = findViewById<Button>(R.id.btn_sign_up)
        btn.setOnClickListener {
            val nameSignup = findViewById<EditText>(R.id.name_signup).text.toString()
            val numeroSignup = findViewById<EditText>(R.id.numero_signup).text.toString()
            val passwordSignup = findViewById<EditText>(R.id.password_signup).text.toString()
            val confirmPassword = findViewById<EditText>(R.id.confirm_password_signup).text.toString()

            if(numeroSignup == ""
                || passwordSignup == ""
                || confirmPassword == ""
                || nameSignup == "") {
                Toast.makeText(this, "Login incompleto. Todos os campos devem ser preenchidos", Toast.LENGTH_SHORT)
                    .show()
            }else {
                if(passwordSignup != confirmPassword) {
                    Toast.makeText(this, "Password doesn't match.", Toast.LENGTH_SHORT).show()
                }else {
                    UserDTO.user = User(nome = nameSignup, numero = numeroSignup, password = passwordSignup, userId = 1)
                    finish()
                }
            }

        }

    }
}