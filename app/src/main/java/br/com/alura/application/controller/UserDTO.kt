package br.com.alura.application.controller

import br.com.alura.application.model.*
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class UserDTO {
    private val database: DatabaseReference = Firebase.database.reference
    var user: User? = null
        set(userUpdate) {
            if(userUpdate == null){
                return
            }
            database.child("users").child(userUpdate.numero.toString()).setValue(userUpdate)
            field = userUpdate
        }

    fun getUser(numero: String, callback: (User?) -> Unit){
        database.child("users").child(numero).get().addOnSuccessListener {
            var teste: User? = null
            if (it.exists()) {
                teste = it.getValue(User::class.java)
            } else {
                teste = null
            }
            callback(teste)
        }
    }
}