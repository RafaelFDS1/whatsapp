package br.com.alura.application.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.application.R
import br.com.alura.application.model.Chat

class ChatRecycleAdapter(
    val chats: List<Chat>,
    val context: Context,
    val listener: (position: Int) -> Unit
) : RecyclerView.Adapter<ChatRecycleAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(chat: Chat, listener: (position: Int) -> Unit) {

            itemView.setOnClickListener{
                listener(adapterPosition)
            }

            val name = itemView.findViewById<TextView>(R.id.chat_name)
            val lastMessage = itemView.findViewById<TextView>(R.id.chat_last_message)

            name.text = chat.nome
            lastMessage.text = chat.desc

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.personalized_list, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = chats.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val chat = chats[position]
        holder.bind(chat, listener)
    }
}