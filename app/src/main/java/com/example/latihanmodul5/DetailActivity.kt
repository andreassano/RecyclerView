package com.example.latihanmodul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.example.latihanmodul5.databinding.ActivityDetailBinding
import com.example.latihanmodul5.databinding.ActivityMainBinding
import com.example.latihanmodul5.databinding.GridLayoutBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val telepon = intent.getStringExtra("telepon")
        val foto = intent.getStringExtra("foto")

        binding.tvNim.text = nim
        binding.tvNama.text = nama
        binding.tvNotelp.text = telepon
        Glide.with(this). load(foto).into(binding.images)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            android.R.id.home ->{
                onBackPressed()
                true
            }else -> super.onOptionsItemSelected(item)
        }
    }
}