package br.com.diary.diaryapp.view.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.diary.diaryapp.R

class RegisterFragment : Fragment() {

    private lateinit var name: TextView
    private lateinit var email: TextView
    private lateinit var ddd: TextView
    private lateinit var phone: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        name = view.findViewById<TextView>(R.id.name)
        email = view.findViewById<TextView>(R.id.email)
        ddd = view.findViewById<TextView>(R.id.ddd)
        phone = view.findViewById<TextView>(R.id.phone)

        view.findViewById<Button>(R.id.btn_register_next).setOnClickListener {
            findNavController().navigate(R.id.action_register_fragment_to_password_fragment)
        }
    }
}