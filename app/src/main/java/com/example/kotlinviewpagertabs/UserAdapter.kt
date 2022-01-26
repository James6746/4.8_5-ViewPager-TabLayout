package com.example.kotlinviewpagertabs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.String
import java.util.ArrayList


class UserAdapter(var userArrayList: ArrayList<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.name.setText(userArrayList[position].name)
        holder.age.setText(String.valueOf(userArrayList[position].age))
        holder.id.setText(String.valueOf(userArrayList[position].id))
    }

    override fun getItemCount(): Int {
        return userArrayList.size
    }

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView
        var age: TextView
        var id: TextView

        init {
            name = itemView.findViewById(R.id.tv_userName)
            age = itemView.findViewById(R.id.tv_userAge)
            id = itemView.findViewById(R.id.tv_userId)
        }
    }
}
