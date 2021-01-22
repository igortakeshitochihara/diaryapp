package br.com.diary.diaryapp.service

import br.com.diary.diaryapp.Settings
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIService {

    private val retrofit = Retrofit.Builder()
        .baseUrl(Settings.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun userService(): UserService = retrofit.create(UserService::class.java)
}