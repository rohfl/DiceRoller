package com.rohit.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button : Button = findViewById(R.id.roll)
        button.setOnClickListener { rollIt() }
    }
    private fun rollIt() {
        var randNo : Int? = Random.nextInt(6) + 1
            var diceImage : ImageView = findViewById(R.id.dice)
            var setNo  = when(randNo) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        diceImage.setImageDrawable(ContextCompat.getDrawable(this, setNo));
    }
}