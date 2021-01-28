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

class PasswordFragment: Fragment() {

    private lateinit var password: TextView
    private lateinit var confirmPassword: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        password = view.findViewById<TextView>(R.id.password)
        confirmPassword = view.findViewById<TextView>(R.id.confirm_password)

        view.findViewById<Button>(R.id.btn_password_next).setOnClickListener {
            findNavController().navigate(R.id.action_password_fragment_to_code_fragment)
        }

        view.findViewById<Button>(R.id.btn_password_back).setOnClickListener {
            findNavController().navigate(R.id.action_password_fragment_to_register_fragment)
        }
    }

}