package com.ms.starwars.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ms.starwars.R
import com.ms.starwars.databinding.LayoutSpecieItemBinding
import com.ms.starwars.models.SpecieEntity
import com.ms.starwars.utils.ext.readHTML
import javax.inject.Inject

/**
 * Created by Mehedi Hasan on 1/20/2021.
 */
class SpeciesAdapter @Inject constructor() :
    ListAdapter<SpecieEntity, SpeciesAdapter.SpeciesViewHolder>(diffCallback) {

    class SpeciesViewHolder(val binding: LayoutSpecieItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpeciesViewHolder {
        return SpeciesViewHolder(
            LayoutSpecieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: SpeciesViewHolder, position: Int) {
        val item = getItem(position)
        val context = holder.binding.root.context

        with(holder.binding) {
            specieNameTv.text = context.getString(R.string.text_name, item.name).readHTML()
            specieLanguageTv.text =
                context.getString(R.string.text_language, item.language).readHTML()
            specieHomeworldTv.text =
                context.getString(R.string.text_home_world, item.homeWorld).readHTML()
        }
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<SpecieEntity>() {
            override fun areItemsTheSame(oldItem: SpecieEntity, newItem: SpecieEntity): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: SpecieEntity, newItem: SpecieEntity): Boolean {
                return oldItem == newItem
            }

        }
    }
}