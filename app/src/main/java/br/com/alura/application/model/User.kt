package br.com.alura.application.model

import br.com.alura.application.model.enums.StatusEnum
import br.com.alura.application.model.enums.TipoEnum
import java.util.*

data class User (
    val nome: String? = null,
    val desc: String? = "Oi, eu cheguei no whatsapp...",
    val numero: String? = null,
    val password: String? = null,
    val isActive: Boolean? = null,
    val calls: List<Calls>? = mutableListOf(Calls(dateCall = "Today", StatusEnum.EFETUADA, TipoEnum.LIGACAO_NORMAL)),
    val comm: List<Community> = mutableListOf(),
    val stts: List<Status> = mutableListOf(),
    val chat: List<Chat> = mutableListOf()
)