package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvHunger = findViewById<TextView>(R.id.tvHunger)
        val tvClean = findViewById<TextView>(R.id.tvClean)
        val tvHappy = findViewById<TextView>(R.id.tvHappy)


        val btnBack = findViewById<Button>(R.id.btnBack)



        //Code Attribution
        //This method was taken on stackoverflow
        //https://stackoverflow.com/questions/68967583/how-to-add-a-photo-to-android-built-in-gallery-in-kotlin
        //Tbijo54
        //https://stackoverflow.com/users/8906352/tbijo54

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var Pic = findViewById<ImageView>(R.id.Pic1)
        tvHunger.text = "0%"
        tvClean.text = "0%"
        tvHappy.text = "0%"
                                                                                                //The button is to change to another picture to show that the dog is eating when clicked//
        btnFeed.setOnClickListener {
            Pic.setImageResource(R.drawable.german_dog_eating)
            tvHunger.text = "100%"
        }
        btnClean.setOnClickListener {
            Pic.setImageResource(R.drawable.german_cleaned)
            tvClean.text = "100%"
        }
        btnPlay.setOnClickListener {
            Pic.setImageResource(R.drawable.dog_playing)
            tvHappy.text = "100%"
        }
        btnClear.setOnClickListener {
            Pic.setImageResource(R.drawable.german_sheperd)

            tvHunger.text = "0%"
            tvClean.text = "0%"
            tvHappy.text = "0%"
        }








    }
}