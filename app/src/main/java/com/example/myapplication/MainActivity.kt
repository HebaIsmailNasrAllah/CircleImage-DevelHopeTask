package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.View.OnHoverListener
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
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

        Glide.with(this).load(FIRST_IMAGE).into(binding.ivRemoteOne)
        Glide.with(this).load(SECOND_IMAGE).into(binding.ivRemoteTwo)
        Glide.with(this).load(THIRD_IMAGE).into(binding.ivRemoteThree)
        Glide.with(this).load(FOURTH_IMAGE).into(binding.ivRemoteFour)


    }

}