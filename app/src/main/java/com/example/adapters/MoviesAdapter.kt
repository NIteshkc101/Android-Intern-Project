package com.example.adapters

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.models.Movie
import com.example.myapplication.R
import com.example.utils.inflate
import com.squareup.picasso.Picasso

class MoviesAdapter(

    private val moviesList : MutableList<Movie>,
    private val onBookmarkedClicked: (position: Int) -> Unit

) :RecyclerView.Adapter<MovieViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MovieViewHolder(parent.inflate(R.layout.movie_sample_layout)) { position ->
            onBookmarkedClicked(position)
        }


    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val myData = moviesList[position]
        val requestOptions = RequestOptions()
            .placeholder(R.drawable.ic_recycler_view_place_holder)

            .error(R.drawable.ic_launcher_background)
        Glide.with(holder.movieImage.context)
            .applyDefaultRequestOptions(requestOptions)
            .load(myData.image)

            .into(holder.movieImage)

//       Picasso.get()
//          .load(myData.image)
//            .resize(100,150)
//          .into(holder.movieImage)

        holder.movieName.text = myData.name
        holder.imdbRating.text = myData.imdbRating.toString()
        holder.yourRating.text = myData.yourRating.toString()
        holder.metaScore.text = myData.metaScore.toString()

        if (myData.isBookmarked) {
            holder.bookmarkButton.imageTintList = ColorStateList.valueOf(Color.YELLOW)
        } else {
            holder.bookmarkButton.imageTintList = ColorStateList.valueOf(Color.GRAY)
        }



    }

    override fun getItemCount(): Int {
        return moviesList.size
    }
}

    class MovieViewHolder(
        itemView: View,
        private val onBookmarkedClicked : (position: Int) -> Unit
    ):RecyclerView.ViewHolder(itemView){
        val movieImage : ImageView = itemView.findViewById(R.id.movieImageView)
        val movieName : TextView = itemView.findViewById(R.id.movieNameTextView)
        val imdbRating : TextView = itemView.findViewById(R.id.imdbRatingTextView)
        val yourRating : TextView = itemView.findViewById(R.id.yourRatingTextView)
        val metaScore : TextView = itemView.findViewById(R.id.metaScoreTextView)
        val bookmarkButton :ImageButton =itemView.findViewById(R.id.bookmarkButtonDefault)
        val removeBookmarkButton : ImageButton = itemView.findViewById(R.id.bookmarkButtonClicked)


        init {
            bookmarkButton.setOnClickListener {
                onBookmarkedClicked(adapterPosition)
            }
        }

    }
