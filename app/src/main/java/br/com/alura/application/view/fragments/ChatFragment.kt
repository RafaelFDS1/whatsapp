package br.com.alura.application.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import br.com.alura.application.R
import br.com.alura.application.model.Chat
import br.com.alura.application.view.ChatBaseAdapter
import java.time.LocalDate
import java.util.*
class ChatFragment : Fragment(R.layout.fragment_chat) {

    companion object {
        val chats: MutableList<Chat> = mutableListOf(
            Chat(nome = "Rafael", "Ligação..."),
            Chat(nome = "Dioguitos", "Seu viado..."),
            Chat(nome = "Felix", "Fez o que eu te pedi?")
        )
        @JvmStatic
        fun newInstance() = ChatFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)

        val listView: ListView = view.findViewById(R.id.list_view)
        listView.adapter = ChatBaseAdapter(chats, view.context)

        return view
    }
}