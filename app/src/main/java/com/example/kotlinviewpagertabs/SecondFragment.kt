package com.example.kotlinviewpagertabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class SecondFragment : Fragment() {
    var recyclerView: RecyclerView? = null
    var userAdapter: UserAdapter? = null
    var userArrayList: ArrayList<User>? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        recyclerView = view.findViewById(R.id.rv_user)
        userArrayList = createUserList()
        userAdapter = UserAdapter(userArrayList!!)
        recyclerView!!.setLayoutManager(GridLayoutManager(view.context, 1))
        recyclerView!!.setAdapter(userAdapter)
        return view
    }

    private fun createUserList(): ArrayList<User> {
        val list = ArrayList<User>()
        for (i in 0..20) {
            list.add(User("$i Asadbek", 22, i * i + 1002))
        }
        return list
    }
}