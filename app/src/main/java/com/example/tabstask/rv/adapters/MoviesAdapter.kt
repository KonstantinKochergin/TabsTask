package com.example.tabstask.rv.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tabstask.R
import com.example.tabstask.dto.MovieDto

class MoviesAdapter(private val movies: Array<MovieDto>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTv: TextView
        val directorTv: TextView
        val releaseYearTv: TextView
        val ratingTv: TextView

        init {
            nameTv = view.findViewById(R.id.name_tv)
            directorTv = view.findViewById(R.id.director_tv)
            releaseYearTv = view.findViewById(R.id.release_year_tv)
            ratingTv = view.findViewById(R.id.rating_tv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTv.text = movies[position].name
        holder.directorTv.text = movies[position].director
        holder.releaseYearTv.text = movies[position].releaseYear.toString()
        holder.ratingTv.text = movies[position].rating.toString()
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}