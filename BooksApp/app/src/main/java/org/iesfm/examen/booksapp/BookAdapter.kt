package org.iesfm.examen.booksapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class BookAdapter(val context: Context) : Adapter<BookAdapter.FilmViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)

    class FilmViewHolder(val v: View) : ViewHolder(v) {
        fun load(book: Book) {
            TODO("Not yet implemented")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}