package com.example.tabstask.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tabstask.R
import com.example.tabstask.dto.BookDto
import com.example.tabstask.rv.adapters.BooksAdapter

class BooksFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_books, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val rv = view.findViewById<RecyclerView>(R.id.books_rv)
        val books = arrayOf(
            BookDto("Война и мир", "Лев Толстой"),
            BookDto("Джордж Оруэлл", "1984"),
            BookDto("Джеймс Джойс", "Улисс"),
            BookDto("Владимир Набоков", "Лолита"),
            BookDto("Уильям Фолкнер", "Звук и ярость"),
        )
        val rvAdapter = BooksAdapter(books)
        rv.layoutManager = LinearLayoutManager(view.context)
        rv.adapter = rvAdapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = BooksFragment()
    }
}