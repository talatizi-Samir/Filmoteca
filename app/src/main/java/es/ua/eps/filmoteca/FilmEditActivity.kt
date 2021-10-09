package es.ua.eps.filmoteca

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_film_data.*
import kotlinx.android.synthetic.main.activity_film_edit.*

class FilmEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_edit)

        cncl_btn.setOnClickListener{
            val extraIntent = Intent(this, FilmDataActivity::class.java)
            extraIntent.putExtra("result", "hecho cambios")
            setResult(Activity.RESULT_OK)
            startActivity(extraIntent)
            finish()
        }

        save_btn.setOnClickListener{
            val extraIntent = Intent(this, FilmDataActivity::class.java)
            extraIntent.putExtra("result", "no ha sido modificado")
            setResult(Activity.RESULT_CANCELED)
            startActivity(extraIntent)
            finish()
        }



    }
}