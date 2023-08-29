package br.com.alura.application.view.fragments

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.get
import br.com.alura.application.R
import br.com.alura.application.model.Chat
import br.com.alura.application.view.ChatBaseAdapter
import br.com.alura.application.view.InternalChatActivity
import java.time.LocalDate
import java.util.*
class ChatFragment : Fragment(R.layout.fragment_chat) {

    companion object {
        val chats: MutableList<Chat> = mutableListOf(
            Chat(nome = "Rafael", "Ligação...", "11958717152"),
            Chat(nome = "Dioguitos", "Seu viado...", "1198777890"),
            Chat(nome = "Felix", "Fez o que eu te pedi?", "1199933388877")
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

        listView.setOnItemClickListener { parent, item, position, id ->
            val bundle = Bundle()
            val intent = Intent(view.context, InternalChatActivity::class.java)
            bundle.putString("numero", chats[id.toInt()].numero)
            intent.putExtras(bundle)
            startActivity(intent)

        }

        return view
    }
}