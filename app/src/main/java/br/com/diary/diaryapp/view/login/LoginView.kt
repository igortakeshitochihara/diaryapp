package br.com.diary.diaryapp.view.login

import br.com.diary.diaryapp.model.Auth

interface LoginView {
    fun loginSuccess(auth: Auth)
    fun loginError(message: String)
}