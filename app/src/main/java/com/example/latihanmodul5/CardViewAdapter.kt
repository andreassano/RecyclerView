package com.example.latihanmodul5

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.latihanmodul5.databinding.CardviewLayoutBinding


class CardViewAdapter (private val context: Context, private val listStudent: ArrayList<MyContact>)
    :RecyclerView.Adapter<CardViewAdapter.ViewHolder>(){
    class ViewHolder(val binding: CardviewLayoutBinding) : RecyclerView.ViewHolder(binding.root){
    }

    //membuat holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = CardviewLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    //Memberitahu banyaknya data yang akan ditampilkan
    override fun getItemCount(): Int {
        return listStudent.size
    }

    //Melakukan penentuan data yang akan ditampilkan pada setiap item / baris
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvNama.text = listStudent[position].nama
        Glide.with(holder.itemView.context).load(listStudent[position].foto).into(holder.binding.images)
        holder.binding.cardView.setOnClickListener {
            val inten = Intent(context, DetailActivity::class.java)
            inten.putExtra("nim", listStudent[position].nim)
            inten.putExtra("nama", listStudent[position].nama)
            inten.putExtra("telepon", listStudent[position].nomorTelepon)
            inten.putExtra("foto", listStudent[position].foto)
            context.startActivity(inten)
        }
    }
}