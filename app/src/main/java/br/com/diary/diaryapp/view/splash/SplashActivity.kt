package br.com.diary.diaryapp.view.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import br.com.diary.diaryapp.R
import br.com.diary.diaryapp.view.login.LoginActivity
import br.com.diary.diaryapp.view.main.MainActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed({ openMain() }, 5000)
    }

    private  fun openMain() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun openLogin() {
        startActivity(Intent(this, LoginActivity::class.java))
    }

}