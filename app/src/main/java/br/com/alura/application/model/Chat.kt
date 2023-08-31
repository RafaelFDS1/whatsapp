package br.com.alura.application.model

data class Chat(
    val chatUser: List<User>,
    val message: List<String>,
    val archived: Boolean,
    val messageOwner: User
)







// Primeiramente deve ser criado a pasta menu no Resources, após isso deve ser criado o menu para uso e utilizado o método de onCreate na activity desejada.
// TODO: Criar a lógica de cada uma das telas do app;
// TODO: Criar os RecycleViews de cada uma das sessões (Community, Status, Calls)
// Obs.: Caso o usuário não ter nenhuma comunidade, deve aparecer uma mensagem incentivando a criar.
