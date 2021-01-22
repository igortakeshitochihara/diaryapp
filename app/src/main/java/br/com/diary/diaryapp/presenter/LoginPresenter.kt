package br.com.diary.diaryapp.presenter

import android.util.Log
import br.com.diary.diaryapp.model.Auth
import br.com.diary.diaryapp.model.Login
import br.com.diary.diaryapp.service.APIService
import br.com.diary.diaryapp.view.login.LoginView
import retrofit2.Callback

class LoginPresenter(val view: LoginView) {

    fun login(email: String, password: String) {
        APIService.userService().login(Login(email, password)).enqueue(object : Callback<Auth?> {
            override fun onResponse(
                call: retrofit2.Call<Auth?>,
                response: retrofit2.Response<Auth?>
            ) {
                response.body()?.let {
                    val auth: Auth = it
                    if (response.code() == 200) view.loginSuccess(auth) else view.loginError("Erro ao logar")
                }

            }

            override fun onFailure(call: retrofit2.Call<Auth?>, t: Throwable) {
                view.loginError("Erro ao logar")
                Log.e("onFailure error", t.message.toString())
            }
        })
    }

}