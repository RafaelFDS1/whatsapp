package br.com.alura.application.model

import java.util.*

data class User (
    val userId: Int? = null,
    val nome: String? = null,
    val desc: String = "Oi, eu cheguei no whatsapp...",
    val numero: String? = null,
    val password: String? = null,
    val calls: List<Calls> = mutableListOf(),
    val comm: List<Community> = mutableListOf(),
    val stts: List<Status> = mutableListOf(),
    val chat: List<Chat> = mutableListOf()
)