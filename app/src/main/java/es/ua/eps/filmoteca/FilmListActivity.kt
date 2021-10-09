package es.ua.eps.filmoteca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_film_list.*

class FilmListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_list)

        filmA_btn.setOnClickListener{
            val intent = Intent(this, FilmDataActivity::class.java)
            startActivity(intent)
        }

        filmB_btn.setOnClickListener{
            val intent = Intent(this, FilmDataActivity::class.java)
            startActivity(intent)
        }

        aboutfilm_btn.setOnClickListener{
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }






    }
}