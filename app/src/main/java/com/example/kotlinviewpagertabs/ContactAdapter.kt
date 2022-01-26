package com.example.kotlinviewpagertabs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ContactAdapter(var contactArrayList: ArrayList<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.name.setText(contactArrayList[position].name)
        holder.number.setText(contactArrayList[position].number)
    }

    override fun getItemCount(): Int {
        return contactArrayList.size
    }

    inner class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView
        var number: TextView

        init {
            name = itemView.findViewById(R.id.tv_contactName)
            number = itemView.findViewById(R.id.tv_contactNumber)
        }
    }
}
