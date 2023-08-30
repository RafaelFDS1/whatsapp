package br.com.alura.application.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.application.R
import br.com.alura.application.model.Calls

class CallRecycleAdapter(
    private val calls: List<Calls>,
    val context: Context,
    private val listener: (position: Int) -> Unit
): RecyclerView.Adapter<CallRecycleAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bind(calls: Calls, listener: (position: Int) -> Unit) {
            itemView.setOnClickListener {
                listener(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.personalized_list, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = calls.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val call = calls[position]
        holder.bind(call, listener)
    }
}