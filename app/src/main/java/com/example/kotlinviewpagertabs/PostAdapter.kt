package com.example.kotlinviewpagertabs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso
import java.util.ArrayList

class PostAdapter(var postArrayList: ArrayList<Post>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.title.setText(postArrayList[position].title)
        holder.text.setText(postArrayList[position].text)
        Picasso.get()
            .load("https://images.unsplash.com/photo-1643028253185-ee7955a97a92?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80")
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return postArrayList.size
    }

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView
        var text: TextView
        var imageView: ShapeableImageView

        init {
            title = itemView.findViewById(R.id.tv_title)
            text = itemView.findViewById(R.id.tv_text)
            imageView = itemView.findViewById(R.id.imgv_postImage)
        }
    }
}
