package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.View.OnHoverListener
import android.widget.Button
import android.widget.ImageView
import com.example.myapplication.databinding.ActivityMainBinding
import de.hdodenhof.circleimageview.CircleImageView


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivLocalOne.setImageResource(R.drawable.local_one)
        binding.ivLocalTwo.setImageResource(R.drawable.local_two)
        binding.ivLocalThree.setImageResource(R.drawable.local_three)
        binding.ivLocalFour.setImageResource(R.drawable.local_four)


    }

}