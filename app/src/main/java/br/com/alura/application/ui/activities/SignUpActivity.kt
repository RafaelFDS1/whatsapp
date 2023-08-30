package br.com.alura.application.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.alura.application.R
import br.com.alura.application.model.User
import br.com.alura.application.model.UserDTO
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn = findViewById<Button>(R.id.btn_sign_up)
        btn.setOnClickListener {
            val loginSignup = findViewById<EditText>(R.id.login_signup).text.toString()
            val passwordSignup = findViewById<EditText>(R.id.password_signup).text.toString()
            val confirmPassword = findViewById<EditText>(R.id.confirm_password_signup).text.toString()
            val nome = findViewById<EditText>(R.id.name_signup).text.toString()

            if(loginSignup == ""
                || passwordSignup == ""
                || confirmPassword == ""
                || nome == "") {
                Toast.makeText(this, "Login incompleto. Todos os campos devem ser preenchidos", Toast.LENGTH_SHORT)
                    .show()
            }else {
                if(passwordSignup != confirmPassword) {
                    Toast.makeText(this, "Password doesn't match.", Toast.LENGTH_SHORT).show()
                }else {
                    UserDTO.user = User(nome = nome, login = loginSignup, password = passwordSignup)
                    finish()
                }
            }

        }

    }
}