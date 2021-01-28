package br.com.diary.diaryapp.view.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.diary.diaryapp.model.Login

class LoginViewModel : ViewModel() {
    // LOGIN FRAGMENT INFORMATION
    private var login = MutableLiveData<Login>()
    val sendLogin: LiveData<Login> get() = login

    // FORGOT FRAGMENT INFORMATION
    private var email = MutableLiveData<String>()
    val sendForgot: LiveData<String> get() = email

    fun onSendLogin(login: Login) {
        this.login.value = login
    }

    fun onSendForgot(email: String) {
        this.email.value = email
    }
}