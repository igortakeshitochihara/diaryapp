package br.com.diary.diaryapp.base

import android.content.Context
import android.content.SharedPreferences
import android.provider.Settings.Global.putString
import androidx.core.content.edit
import br.com.diary.diaryapp.Settings
import br.com.diary.diaryapp.model.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Prefs(context: Context) {
    private val gson = Gson()
    private val sharedPrefs: SharedPreferences =
        context.getSharedPreferences(Settings.PREFERENCES, Context.MODE_PRIVATE)

    fun getPreference(name: String): String {
        return sharedPrefs.getString(name, "") ?: ""
    }

    fun setPreference(name: String, value: String) {
        sharedPrefs.edit { putString(name, value) }
    }

    fun getUser(): User? {
        val jsonString = sharedPrefs.getString("USER", null) ?: return null
        return gson.fromJson(jsonString, object : TypeToken<User>() {}.type)
    }

    fun setUser(user: User) {
        sharedPrefs.edit { putString("USER", gson.toJson(user)) }
    }

}