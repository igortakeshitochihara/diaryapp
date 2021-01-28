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

class CodeFragment : Fragment() {

    private lateinit var code1: TextView
    private lateinit var code2: TextView
    private lateinit var code3: TextView
    private lateinit var code4: TextView
    private lateinit var code5: TextView
    private lateinit var code6: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_code, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        code1 = view.findViewById<TextView>(R.id.code1)
        code2 = view.findViewById<TextView>(R.id.code2)
        code3 = view.findViewById<TextView>(R.id.code3)
        code4 = view.findViewById<TextView>(R.id.code4)
        code5 = view.findViewById<TextView>(R.id.code5)
        code6 = view.findViewById<TextView>(R.id.code6)

        view.findViewById<Button>(R.id.btn_code_send).setOnClickListener {
        }
    }
}