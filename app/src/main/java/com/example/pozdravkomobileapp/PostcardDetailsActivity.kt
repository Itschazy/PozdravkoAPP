package com.example.pozdravkomobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_postcard_details.*

class PostcardDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postcard_details)



        val postcard = intent.extras?.getSerializable("Postcard") as Postcard

        postcardCategory.text = "Категория: ${postcard.category}"
        postcardName.text = "Открытка: ${postcard.number}"
    }
}