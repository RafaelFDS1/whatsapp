package br.com.alura.application.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.alura.application.R

class CommFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = CommFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_comm, container, false)
    }
}