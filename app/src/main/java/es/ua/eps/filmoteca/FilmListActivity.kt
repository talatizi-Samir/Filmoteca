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
            val extraIntent = Intent(this, FilmDataActivity::class.java)
            extraIntent.putExtra("EXTRA_FILM_TITLE", "Film A")
            startActivity(extraIntent)
        }

        filmB_btn.setOnClickListener{
            val extraIntent = Intent(this, FilmDataActivity::class.java)
            extraIntent.putExtra("EXTRA_FILM_TITLE", "Film B")
            startActivity(extraIntent)
        }

        aboutfilm_btn.setOnClickListener{
            val extraIntent = Intent(this, FilmDataActivity::class.java)
            extraIntent.putExtra("EXTRA_FILM_TITLE", "Film C")
            startActivity(extraIntent)
        }







    }
}