package com.example.tabstask.rv.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tabstask.R
import com.example.tabstask.dto.BookDto

class BooksAdapter(private val books: Array<BookDto>): RecyclerView.Adapter<BooksAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val authorTv: TextView
        val nameTv: TextView

        init {
            authorTv = view.findViewById(R.id.book_author)
            nameTv = view.findViewById(R.id.book_name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.authorTv.text = books[position].author
        holder.nameTv.text = books[position].name
    }

    override fun getItemCount(): Int {
        return books.size
    }
}