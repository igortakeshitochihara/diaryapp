package br.com.diary.diaryapp.base

import br.com.diary.diaryapp.App

class Util {
    val prefs: Prefs by lazy {
        Prefs(App.instance)
    }

}