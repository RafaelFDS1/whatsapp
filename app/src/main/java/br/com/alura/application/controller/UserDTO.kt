package br.com.alura.application.controller

import br.com.alura.application.model.*
import br.com.alura.application.model.enums.StatusEnum
import br.com.alura.application.model.enums.TipoEnum
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

class UserDTO {
    val database: DatabaseReference = Firebase.database.reference
    var user: User? = null
        set(userUpdate) {
            if(userUpdate == null){
                return
            }
            database.child("users").child(userUpdate.numero.toString()).setValue(userUpdate)
            field = userUpdate
        }

    fun getUser(numero: String): User? {
        database.child("users").child(numero).get().addOnSuccessListener {
            if (it.exists()) {
                val userUpdate = it.getValue(User::class.java)
                user = userUpdate
            } else {
                user = null
            }
        }
        return user
    }
}