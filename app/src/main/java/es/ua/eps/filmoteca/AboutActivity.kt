package es.ua.eps.filmoteca

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)


          web_button.setOnClickListener{
        val viewIntent = Intent(Intent.ACTION_VIEW,
            Uri.parse("http://www.midominio.com"))

        if (viewIntent.resolveActivity(packageManager) != null) {
            startActivity(viewIntent) } }



        soporte_button.setOnClickListener{
            val viewIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("mailto:midireccion@dominio.com"))

            if (viewIntent.resolveActivity(packageManager) != null) {
                startActivity(viewIntent) } }



        volver_button.setOnClickListener {
            finish()
        }














        }
}
