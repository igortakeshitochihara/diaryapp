package br.com.diary.diaryapp.presenter

import android.content.res.Resources
import android.provider.Settings.Global.getString
import android.util.Log
import androidx.core.content.res.TypedArrayUtils.getText
import br.com.diary.diaryapp.R
import br.com.diary.diaryapp.base.Util
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
                    if (response.code() == 200)
                        view.loginSuccess(auth)
                }
                view.loginError(response.message())
            }

            override fun onFailure(call: retrofit2.Call<Auth?>, t: Throwable) {
                view.loginError(Util().getStringValue(R.string.error_message_generic))
                Log.e("onFailure error", t.message.toString())
            }
        })
    }

}