package br.com.diary.diaryapp.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import br.com.diary.diaryapp.R

class ForgotFragment : Fragment() {

    private lateinit var forgot: TextView

    private val viewModel: LoginViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        forgot = view.findViewById<TextView>(R.id.forgot)

        view.findViewById<Button>(R.id.btn_forgot_send).setOnClickListener {
            onValidateForgot()
        }

        view.findViewById<Button>(R.id.btn_forgot_back).setOnClickListener {
            findNavController().navigate(R.id.action_forgot_fragment_to_login_fragment)
        }
    }

    private fun onValidateForgot() {
        viewModel.onSendForgot(forgot.text.toString())
    }
}