package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Picasso.get().load("https://i.pinimg.com/736x/1b/ce/00/1bce005b881dfb3715dfe026e45c3aab.jpg").into(binding.imageView);
        got()
    }
    fun got() {
        //https://cdn-icons-png.flaticon.com/512/2883/2883375.png
        binding.button.setOnClickListener {
            Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZZJhuYv4nxQJGsjcoOJPuwlQXTxYyy_z20A&usqp=CAU").into(binding.imageView);
            got1()
        }
    }
    fun got1(){
        binding.button.setOnClickListener {
            Picasso.get().load("https://cdn-icons-png.flaticon.com/512/2883/2883375.png").into(binding.imageView);
            got2()
        }

    }
    fun got2(){
        binding.button.setOnClickListener {
            Picasso.get().load("https://i.pinimg.com/736x/1b/ce/00/1bce005b881dfb3715dfe026e45c3aab.jpg").into(binding.imageView);
            got()
        }
    }

    }
/////////////////////////////////////////////////////////////////////////////////////////////////
//Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(imageView);
// file:///C:/Users/student/Desktop/free-icon-3d-15337491.png
//
//        val num1 = "0"
//
//        when (num1) {
//            "0" -> {
//                binding.button.setOnClickListener {
//                    binding.imageView.setImageDrawable(getDrawable(R.drawable.tablet))
//                }
//                val num1 = "1"
//
//
//            }
//
//            "1" -> {
//                binding.button.setOnClickListener {
//                    binding.imageView.setImageDrawable(getDrawable(R.drawable.notes))
//                }
//                val num1 = "2"
//
//            }
//
//            "2" -> {
//                binding.button.setOnClickListener {
//                    binding.imageView.setImageDrawable(getDrawable(R.drawable.computer))
//                }
//                val num1 = "0"
//
//            }
//
//            else -> {
//                binding.button.setOnClickListener {
//                    binding.imageView.setImageDrawable(getDrawable(R.drawable.notes))
//                }
//                val num1 = num1 + 1
//
//            }
//        }
//    }
//}