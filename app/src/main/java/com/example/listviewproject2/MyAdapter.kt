package com.example.listviewproject2

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listviewproject2.databinding.ActivityMainBinding
import com.example.listviewproject2.databinding.EachitemBinding
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context:Activity, val arrayList: ArrayList<User>) :


ArrayAdapter<User>(context, R.layout.eachitem, arrayList)    {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.eachitem, null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.profileName)
        val lastMsg = view.findViewById<TextView>(R.id.lastMessage)
        val time = view.findViewById<TextView>(R.id.time)

        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMsg
        time.text = arrayList[position].LastMsgTime
        image.setImageResource(arrayList[position].ImageId)
        return view
    }
}