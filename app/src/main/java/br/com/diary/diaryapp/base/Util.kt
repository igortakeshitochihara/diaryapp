package br.com.diary.diaryapp.base

import android.content.res.Resources
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes
import br.com.diary.diaryapp.App
import br.com.diary.diaryapp.R

class Util {
    val prefs: Prefs by lazy {
        Prefs(App.instance)
    }

    fun getStringValue(value: Int): String {
        val res: Resources = Resources.getSystem()
        return res.getString(value)
    }

}