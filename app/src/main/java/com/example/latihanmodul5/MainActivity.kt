package com.example.latihanmodul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanmodul5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.root
        setContentView(binding.root)


        val listStudent = arrayListOf(
            MyContact("20102017", "Andreas", "081385048748", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"),
            MyContact("20102017", "Novito", "081385048748", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"),
            MyContact("20102017", "Andi", "081385048748", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"),
            MyContact("20102017", "Sano", "081385048748", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"),
            MyContact("20102017", "Andreas", "081385048748", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"),
            MyContact("20102017", "Novito", "081385048748", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"),
            MyContact("20102017", "Andi", "081385048748", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"),
            MyContact("20102017", "Sano", "081385048748", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"),
        )

        cardView(listStudent)

    }

    private fun listView(value: ArrayList<MyContact>){
        //adapter
        val adapter = ListViewAdapter(this, value)

        //layout
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun gridView(value: ArrayList<MyContact>){
        //adapter
        val adapter = GridViewAdapter(this, value)

        //layout
        val layoutManager = GridLayoutManager(this,2, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun cardView(value: ArrayList<MyContact>){
        //adapter
        val adapter = CardViewAdapter(this, value)

        //layout
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

}