package com.example.groceries2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.groceriesshoppingapp.CategoriesAdapter


class HomeFragment : Fragment() {

    var list = ArrayList<category>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment
        var rv: RecyclerView? = view.findViewById(R.id.rv_home)
        if (rv != null) {
            rv.layoutManager =  LinearLayoutManager(activity, RecyclerView.VERTICAL,false)
        }

        val items = fetchData()
        val adapter: CategoriesAdapter =
            CategoriesAdapter(items,this)
        rv?.adapter = adapter
        return view
    }
    private fun fetchData(): ArrayList<category> {
        list.add(category("12345","Household"))
        list.add(category("12345","Groceries"))
        list.add(category("12345","Liqure"))
        list.add(category("12345","Chilled"))


        return list
    }

    fun onItemClicked(category: category) {

    }


}