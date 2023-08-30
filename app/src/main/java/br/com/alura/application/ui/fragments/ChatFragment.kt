package br.com.alura.application.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.application.R
import br.com.alura.application.model.Chat
import br.com.alura.application.ui.adapters.ChatRecycleAdapter
import br.com.alura.application.ui.activities.InternalChatActivity

class ChatFragment : Fragment(R.layout.fragment_chat) {

    companion object {
        val chats: MutableList<Chat> = mutableListOf(
            Chat(nome = "Rafael", "Ligação...", "11958717152"),
            Chat(nome = "Dioguitos", "Seu viado...", "1198777890"),
            Chat(nome = "Felix", "Fez o que eu te pedi?", "1199933388877")
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.chat_recycler_view)
        recyclerView.adapter = ChatRecycleAdapter(chats, view.context) {position ->
            val bundle = Bundle()
            val intent = Intent(view.context, InternalChatActivity::class.java)
            bundle.putString("numero", chats[position].numero)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        return view
    }
}