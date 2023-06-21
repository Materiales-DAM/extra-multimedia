package org.iesfm.examen.booksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val books = listOf(
            Book("A32432432", "El señor de los anillos", "Tolkien"),
            Book("A32432433", "El hobbit", "Tolkien"),
            Book("A32432434", "Brooklyn Follies", "Paul Auster"),
            Book("A32432435", "2666", "Roberto Bolaño"),
            Book("A32432436", "Rayuela", "Julio Cortázar"),
            Book("A32432437", "Crimen y castigo", "Dostoyevski")
        )
    }
}