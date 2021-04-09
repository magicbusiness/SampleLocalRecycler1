package com.example.samplelocalrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.samplelocalrecycler.`object`.SampleObject
import com.example.samplelocalrecycler.adapter.SampleAdapter
import com.example.samplelocalrecycler.databinding.ActivityMainBinding
import com.example.samplelocalrecycler.modal.Sheets
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    //
    private lateinit var binding: ActivityMainBinding

    //
    private var listSheets: ArrayList<Sheets> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        //
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //  Get data from Object
        listSheets.addAll(SampleObject.dataList)

        //
        showRecycler()
    }

    private fun showRecycler()
    {
        sample_recycler.layoutManager = LinearLayoutManager(this)
        sample_recycler.adapter = SampleAdapter(listSheets)
    }
}