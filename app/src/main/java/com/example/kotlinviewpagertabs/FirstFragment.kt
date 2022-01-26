package com.example.kotlinviewpagertabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class FirstFragment : Fragment() {
    var recyclerView: RecyclerView? = null
    var contactAdapter: ContactAdapter? = null
    var contactArrayList: ArrayList<Contact>? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_first, container, false)
        recyclerView = v.findViewById(R.id.contactRecyclerView)
        contactArrayList = createContactList()
        contactAdapter = ContactAdapter(contactArrayList!!)
        recyclerView!!.setLayoutManager(GridLayoutManager(v.context, 1))
        recyclerView!!.setAdapter(contactAdapter)
        return v
    }

    private fun createContactList(): ArrayList<Contact> {
        val list = ArrayList<Contact>()
        for (i in 0..20) {
            list.add(Contact("$i James", "+998932006746"))
        }
        return list
    }
}