package br.com.diary.diaryapp.view.initial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.com.diary.diaryapp.R
import br.com.diary.diaryapp.view.login.LoginActivity
import br.com.diary.diaryapp.view.register.RegisterActivity

class InitialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial)

        findViewById<Button>(R.id.btn_initial_login).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        findViewById<Button>(R.id.btn_initial_register).setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

}