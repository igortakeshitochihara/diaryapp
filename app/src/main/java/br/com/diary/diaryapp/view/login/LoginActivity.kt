package br.com.diary.diaryapp.view.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import br.com.diary.diaryapp.R
import br.com.diary.diaryapp.base.Util
import br.com.diary.diaryapp.model.Auth
import br.com.diary.diaryapp.presenter.LoginPresenter
import br.com.diary.diaryapp.view.register.RegisterActivity

class LoginActivity : AppCompatActivity(), LoginView {

    private lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenter(this)

        findViewById<LinearLayout>(R.id.ll_back).setOnClickListener {
            finish()
        }
    }

    override fun loginSuccess(auth: Auth) {
        Util().prefs.setPreference("TOKEN", auth.token);
        Log.e("TOKEN", auth.token)
        Log.e("USER", auth.user.name)
        Log.e("TOKEN_PREFS", Util().prefs.getPreference("TOKEN"))
    }

    override fun loginError(message: String) {
        Log.e("MESSAGE", message)
    }


}