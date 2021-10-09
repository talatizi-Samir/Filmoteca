package es.ua.eps.filmoteca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_film_data.*



class FilmDataActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_data)

        rel_btn.setOnClickListener{
            val intent = Intent(this, FilmDataActivity::class.java)
            startActivity(intent)
        }

        dataEdit_btn.setOnClickListener{
            val intent = Intent(this, FilmEditActivity::class.java)
            startActivity(intent)
        }

        ret_btn.setOnClickListener{
            val intent = Intent(this, FilmListActivity::class.java)
            startActivity(intent)
        }

        val flagIntent = Intent(this , FilmDataActivity::class.java)
        flagIntent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        startActivity(flagIntent)


        val extraIntent = intent
        val s = extraIntent.getStringExtra("EXTRA_FILM_TITLE" )
        val d= extraIntent.getStringExtra("result")
        textView2.setText(s.plus(" ").plus(d)
        )

    }



}