package es.ua.eps.filmoteca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_film_edit.*

class FilmEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_edit)

        cncl_btn.setOnClickListener{
            finish()
        }

        save_btn.setOnClickListener{
            finish()
        }



    }
}