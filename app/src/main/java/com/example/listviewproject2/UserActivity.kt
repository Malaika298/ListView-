package com.example.listviewproject2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewproject2.databinding.ActivityMainBinding
import com.example.listviewproject2.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {


    lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val usernames = intent.getStringExtra("usernam")
        val userPhoneno = intent.getStringExtra("userno")
        val userimage = intent.getIntExtra("userimg", R.drawable.profile)

        binding.tVName.text = usernames
        binding.profileImage.setImageResource(userimage)
        binding.tVNo.text = userPhoneno
    }
}