package com.example.home_work2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val button = view.findViewById<Button>(R.id.toListBtn)
        button.setOnClickListener {
        //    findNavController().navigate(R.id.action_homeFragment_to_listFragment)

            val fragment = ListFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.display_fragment,fragment)?.commit()
        }

        val button2 = view.findViewById<Button>(R.id.textToProfileBtn)
        button2.setOnClickListener {
            val Fname = view.findViewById<EditText>(R.id.FirstNameET)
            val Finput = Fname.text.toString()
            val Lname = view.findViewById<EditText>(R.id.LastNameET)
            val Linput = Lname.text.toString()
            val Gpa = view.findViewById<EditText>(R.id.GpaET)
            val Ginput = Gpa.text.toString()

            val bundle = Bundle()
            bundle.putString("Fname", Finput)
            bundle.putString("Lname", Linput)
            bundle.putString("Gpa", Ginput)

            val fragment = ProfileFragment()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.display_fragment,fragment)?.commit()
        }

        return view
    }


}