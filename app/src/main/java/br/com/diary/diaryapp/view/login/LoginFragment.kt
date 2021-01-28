package br.com.diary.diaryapp.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import br.com.diary.diaryapp.R
import br.com.diary.diaryapp.model.Login

class LoginFragment : Fragment() {

    private lateinit var email: TextView
    private lateinit var password: TextView

    private val viewModel: LoginViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        email = view.findViewById<TextView>(R.id.email)
        password = view.findViewById<TextView>(R.id.password)

        view.findViewById<Button>(R.id.btn_login_send).setOnClickListener {
            onValidateLogin()
        }

        view.findViewById<TextView>(R.id.tv_forgot).setOnClickListener {
            findNavController().navigate(R.id.action_login_fragment_to_forgot_fragment)
        }
    }

    private fun onValidateLogin() {
        viewModel.onSendLogin(Login(email.text.toString(), password.text.toString()))
    }

}