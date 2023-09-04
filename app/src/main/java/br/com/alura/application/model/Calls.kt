package br.com.alura.application.model

import br.com.alura.application.model.enums.StatusEnum
import br.com.alura.application.model.enums.TipoEnum

data class Calls(
    val dateCall: String? = null,
    val status: StatusEnum? = null,
    val tipo: TipoEnum? = null
)
