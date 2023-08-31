package br.com.alura.application.model

data class Community (
    val commId: Int,
    val name: String,
    val description: String,
    val adms: List<User>,
    val chat: Chat
)
