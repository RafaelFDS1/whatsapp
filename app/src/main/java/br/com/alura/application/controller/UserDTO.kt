package br.com.alura.application.controller

import br.com.alura.application.model.User
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class UserDTO {
    private val database: DatabaseReference = Firebase.database.reference
}