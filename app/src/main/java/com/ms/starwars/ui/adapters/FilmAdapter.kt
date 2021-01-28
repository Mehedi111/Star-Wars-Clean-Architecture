package com.ms.starwars.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ms.starwars.databinding.LayoutFilmItemBinding
import com.ms.starwars.models.FilmEntity
import com.ms.starwars.utils.ext.concat
import javax.inject.Inject

/**
 * Created by Mehedi Hasan on 1/20/2021.
 */
class FilmAdapter @Inject constructor() :
    ListAdapter<FilmEntity, FilmAdapter.FilmViewHolder>(diffCallback) {

    class FilmViewHolder(val binding: LayoutFilmItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        return FilmViewHolder(
            LayoutFilmItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film = getItem(position)
        with(holder.binding) {
            filmNameTv.text = film.title
            filmCrawlTv.text = film.openingCrawl
            filmCharactersTv.text = film.characters.concat()
        }
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<FilmEntity>() {
            override fun areItemsTheSame(oldItem: FilmEntity, newItem: FilmEntity): Boolean {
                return oldItem.title == newItem.title
            }

            override fun areContentsTheSame(oldItem: FilmEntity, newItem: FilmEntity): Boolean {
                return oldItem == newItem
            }

        }
    }
}