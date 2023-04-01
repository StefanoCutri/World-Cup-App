package com.example.worldcupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldcupapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
    }

    fun initialize(){
        //Adapter
        var adapter = MyAdapter(this, generateData())
        with(binding){
            listView.adapter = adapter
            adapter.notifyDataSetChanged()
        }
    }

    fun generateData(): ArrayList<CountryModel>{
        var countries = ArrayList<CountryModel>()

        var country1 : CountryModel = CountryModel(
             "Brasil",
            "5",
            R.drawable.brazil
        )

        var country2: CountryModel = CountryModel(
            "France",
            "2",
            R.drawable.germany
        )

        var country3 : CountryModel = CountryModel(
            "Germany",
            "4",
            R.drawable.france
        )

        var country4 : CountryModel = CountryModel(
            "Spain",
            "1",
            R.drawable.spain
        )

        var country5 : CountryModel = CountryModel(
            "United Kingdom",
            "1",
            R.drawable.unitedkingdom
        )

        var country6 : CountryModel = CountryModel(
            "United States",
            "0",
            R.drawable.unitedstates
        )

        var country7 : CountryModel = CountryModel(
            "Saudi Arabia",
            "0",
            R.drawable.saudiarabia
        )
        countries.add(country1)
        countries.add(country2)
        countries.add(country3)
        countries.add(country4)
        countries.add(country5)
        countries.add(country6)
        countries.add(country7)

        return countries
    }
}