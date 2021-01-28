package com.ms.starwars.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ms.starwars.databinding.LayoutCharacterItemBinding
import com.ms.starwars.models.CharacterEntity
import javax.inject.Inject

/**
 * Created by Mehedi Hasan on 1/18/2021.
 */
typealias ClickListener = ((CharacterEntity) -> Unit)?

class SearchedCharacterAdapter @Inject constructor() :
    ListAdapter<CharacterEntity, SearchedCharacterAdapter.SearchedCharacterViewHolder>(diffCallback) {

    private var onItemClick: ClickListener = null
    fun setOnItemClickListener(listener: ClickListener) {
        onItemClick = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchedCharacterViewHolder {
        return SearchedCharacterViewHolder(
            LayoutCharacterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: SearchedCharacterViewHolder, position: Int) {
        val item = getItem(position)
        with(holder.binding) {
            characterNameTextView.text = item.name
            characterBirthYearTextView.text = item.birthYear
        }
        holder.bindListener(item, onItemClick)
    }

    class SearchedCharacterViewHolder(val binding: LayoutCharacterItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        //handle item click listener
        fun bindListener(item: CharacterEntity, onItemClick: ClickListener) {
            itemView.setOnClickListener {
                onItemClick.let { click ->
                    click?.invoke(item)
                }
            }
        }
    }

    companion object {

        private val diffCallback = object : DiffUtil.ItemCallback<CharacterEntity>() {
            override fun areItemsTheSame(
                oldItem: CharacterEntity,
                newItem: CharacterEntity
            ): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(
                oldItem: CharacterEntity,
                newItem: CharacterEntity
            ): Boolean {
                return oldItem == newItem
            }

        }
    }
}