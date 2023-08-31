package br.com.alura.application.model

import java.util.*

data class User (
    val userId: Int,
    val nome: String,
    val desc: String = "Oi, eu cheguei no whatsapp...",
    val numero: String,
    val password: String,
    val calls: List<Calls> = mutableListOf(),
    val comm: List<Community> = mutableListOf(),
    val stts: List<Status> = mutableListOf(),
    val chat: List<Chat> = mutableListOf()
)