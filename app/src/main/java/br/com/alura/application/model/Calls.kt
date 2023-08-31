package br.com.alura.application.model

import br.com.alura.application.model.enums.StatusEnum
import br.com.alura.application.model.enums.TipoEnum

data class Calls (
    val user: User,
    val dateCall: String,
    val status: StatusEnum,
    val tipo: TipoEnum
)
