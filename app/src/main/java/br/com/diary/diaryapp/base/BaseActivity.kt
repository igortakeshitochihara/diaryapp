package br.com.diary.diaryapp.base

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity(), BaseView {
    override fun onUnauthenticated() {
        Log.e("UNAUTHENTICATED_MESSAGE", "Saia!")
    }

}