package br.com.alura.application.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import br.com.alura.application.R
import br.com.alura.application.model.Chat

class ChatBaseAdapter(
    val chats: MutableList<Chat>,
    val context: Context
) : BaseAdapter() {

    override fun getCount(): Int {
        return chats.size
    }

    override fun getItem(position: Int): Any {
        return chats[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var view: View? = convertView
        if (view == null) {
            val chat = chats[position]
            val inflater: LayoutInflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.personalized_list, parent, false)
        }

        val name = view?.findViewById<TextView>(R.id.chat_name)
        val lastMessage = view?.findViewById<TextView>(R.id.chat_last_message)
        val lastContact = view?.findViewById<TextView>(R.id.chat_last_contact)

        val chat = chats[position]

        name?.text = chat.nome
        lastMessage?.text = chat.desc
//        lastContact?.text = chat.lastContact.toString()

        return view
    }
}