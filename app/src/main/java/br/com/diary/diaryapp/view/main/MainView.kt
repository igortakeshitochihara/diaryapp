package br.com.diary.diaryapp.view.main

import br.com.diary.diaryapp.model.Auth

interface MainView {
    fun mainSuccess(auth: Auth)
    fun mainError(message: String)
}