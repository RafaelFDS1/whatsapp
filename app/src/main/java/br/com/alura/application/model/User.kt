package br.com.alura.application.model

import java.util.*

class User (
    val nome:String,
    var login: String,
    var password: String,
    val dataNasc: Date? = null,
    val email: String? = null,
    val alias: String? = null
){
}