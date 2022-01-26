package com.example.kotlinviewpagertabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ThirdFragment : Fragment() {
    var recyclerView: RecyclerView? = null
    var postAdapter: PostAdapter? = null
    var postArrayList: ArrayList<Post>? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        recyclerView = view.findViewById(R.id.rv_post)
        postArrayList = createPostList()
        postAdapter = PostAdapter(postArrayList!!)
        recyclerView!!.setLayoutManager(GridLayoutManager(view.context, 1))
        recyclerView!!.setAdapter(postAdapter)
        return view
    }

    private fun createPostList(): ArrayList<Post> {
        val list = ArrayList<Post>()
        for (i in 0..20) {
            list.add(Post("Tashkent", resources.getString(R.string.info), 125))
        }
        return list
    }
}