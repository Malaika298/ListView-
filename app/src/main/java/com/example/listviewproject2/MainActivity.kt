package com.example.listviewproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewproject2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList:ArrayList<User>

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val names = arrayOf("Malaika", "Iqra", "Misba", "Laiba", "Amna")

        val lastMsg = arrayOf("Hello", "Where are you?", "Hi", "I m good", "Like what..")

        val lastMsgTime = arrayOf("4:15 Pm", "1:30 Pm", "11:00 Am", "9:07 Pm", "2:00 Pm")

        val phonnumber = arrayOf("0321 573982", "0331 573982", "0321 5778982",
            "0322 573982", "0341 573982")

        val Img = intArrayOf(R.drawable.profile, R.drawable.profilei, R.drawable.profilem,
            R.drawable.profilel, R.drawable.profilea)

        userArrayList = ArrayList()

        for (eachIndex in names.indices){

            val user = User(names[eachIndex], lastMsg[eachIndex], lastMsgTime[eachIndex],
            phonnumber[eachIndex], Img[eachIndex])

            userArrayList.add(user)
        }

//        By Default also Clickable
        binding.listView.isClickable = true

        binding.listView.adapter = MyAdapter(this, userArrayList)
        
        binding.listView.setOnItemClickListener { parent, view, position, id ->

            val username = names[position]
            val userPhoneNo = phonnumber[position]
            val userImg = Img[position]

            val intent = Intent(this, UserActivity::class.java)

            intent.putExtra("usernam", username)
            intent.putExtra("userno", userPhoneNo)
            intent.putExtra("userimg", userImg)

            startActivity(intent)
        }
    }
}