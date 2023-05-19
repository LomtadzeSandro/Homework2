package com.example.home_work2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val imageView1 = view.findViewById<ImageView>(R.id.toProfileIV)
        imageView1.setOnClickListener {
            val fragment = ProfileFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.display_fragment, fragment)?.commit()
        }

        val imageView2 = view.findViewById<ImageView>(R.id.toHomeIV)
        imageView2.setOnClickListener {
            val fragment = HomeFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.display_fragment, fragment)?.commit()
        }

        return view
    }

}