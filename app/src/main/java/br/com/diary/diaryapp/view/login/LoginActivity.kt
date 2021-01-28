package br.com.diary.diaryapp.view.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import br.com.diary.diaryapp.R
import br.com.diary.diaryapp.base.Util
import br.com.diary.diaryapp.model.Auth
import br.com.diary.diaryapp.presenter.LoginPresenter
import br.com.diary.diaryapp.view.register.RegisterActivity

class LoginActivity : AppCompatActivity(), LoginView {

    private lateinit var presenter: LoginPresenter
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenter(this)

        viewModel.sendLogin.observe(this, Observer { login ->
            Log.d("MODEL_LOGIN", login.email + " " + login.password)
        })

        viewModel.sendForgot.observe(this, Observer { email ->
            Log.d("EMAIL_FORGOT", email)
        })

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

