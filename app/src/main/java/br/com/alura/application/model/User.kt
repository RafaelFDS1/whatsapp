package br.com.alura.application.model

import java.util.*

data class User (
    val userId: Int,
    val nome: String,
    val desc: String,
    val numero: String,
    val archived: Boolean,
    val calls: Calls,
    val comm: Community,
    val stts: Status
){}