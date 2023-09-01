package br.com.alura.application.controller

import br.com.alura.application.model.*
import br.com.alura.application.model.enums.StatusEnum
import br.com.alura.application.model.enums.TipoEnum
import com.google.firebase.database.DatabaseReference
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
            database.child("users").child(userUpdate.userId.toString()).setValue(userUpdate)
        }

    fun getUser(id: Long) {
//      TODO: Implementar metodo get para Login e captura dos dados.
    }
}