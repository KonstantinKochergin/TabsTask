package com.example.tabstask.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tabstask.R
import com.example.tabstask.dto.MovieDto
import com.example.tabstask.rv.adapters.MoviesAdapter

class MoviesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val rv = view.findViewById<RecyclerView>(R.id.movies_rv)
        val movies = arrayOf(
            MovieDto("Зеленая миля", "Фрэнк Дарабонт", 1999, 9.1f),
            MovieDto("Список Шиндлера", "Стивен Спилберг", 1993, 9f),
            MovieDto("Побег из Шоушенка", "Фрэнк Дарабонт", 1994, 9f),
            MovieDto("Форрест Гамп", "Роберт Земекис", 1994, 8.9f),
            MovieDto("Криминальное чтиво", "Квентин Тарантино", 1994, 8.7f),
        )
        val rvAdapter = MoviesAdapter(movies)
        rv.layoutManager = LinearLayoutManager(view.context)
        rv.adapter = rvAdapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = MoviesFragment()
    }
}