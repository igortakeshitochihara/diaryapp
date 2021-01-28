package br.com.diary.diaryapp.view.register

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import br.com.diary.diaryapp.R

class RegisterActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<LinearLayout>(R.id.ll_back).setOnClickListener {
            finish()
        }
    }
}