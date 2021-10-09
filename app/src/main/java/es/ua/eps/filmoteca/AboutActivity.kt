package es.ua.eps.filmoteca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        }

    fun toast(view: android.view.View) {
        Toast.makeText(this, "Funcionalidad sin implementar",Toast.LENGTH_LONG).show()
    }
}
