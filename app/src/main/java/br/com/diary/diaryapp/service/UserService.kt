package br.com.diary.diaryapp.service

import br.com.diary.diaryapp.model.Auth
import br.com.diary.diaryapp.model.Login
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UserService {
    @POST("login")
    fun login(@Body login: Login): Call<Auth>
}