package com.example.samplelocalrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.samplelocalrecycler.databinding.ActivityDetailBinding
import com.example.samplelocalrecycler.modal.Sheets
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity()
{
    //
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        //
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //
        val passing = intent.getParcelableExtra<Sheets>("recycler_main")

        image_detail.setImageResource(passing!!.image)
        title_detail.text = passing.title
        text_detail.text = passing.desc
    }
}