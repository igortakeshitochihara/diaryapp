package br.com.diary.diaryapp.view.main

import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import br.com.diary.diaryapp.R
import br.com.diary.diaryapp.base.Util
import br.com.diary.diaryapp.model.Auth
import br.com.diary.diaryapp.model.User
import br.com.diary.diaryapp.presenter.LoginPresenter
import br.com.diary.diaryapp.view.login.LoginView

class MainActivity : AppCompatActivity(), LoginView {

    private lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        presenter = LoginPresenter(this)

        presenter.login("testigor@test.com", "123456")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun loginSuccess(auth: Auth) {
        Util().prefs.setPreference("TOKEN", auth.token);
        Log.e("TOKEN", auth.token)
        Log.e("USER", auth.user.name)
        Log.e("TOKEN_PREFS", Util().prefs.getPreference("TOKEN"))
    }

    override fun loginError(message: String) {
        Log.e("MESSAGE", message)
    }
}