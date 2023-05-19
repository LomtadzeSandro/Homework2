package com.example.home_work2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val Fname = view.findViewById<TextView>(R.id.FirstNameTV)
        val Lname = view.findViewById<TextView>(R.id.LastNameTV)
        val Gpa = view.findViewById<TextView>(R.id.GpaTV)

        val args = this.arguments

        val FnameData = args?.get("Fname")
        val LnameData = args?.get("Lname")
        val GpaData = args?.get("Gpa")

        Fname.text = FnameData.toString()
        Lname.text = LnameData.toString()
        Gpa.text = GpaData.toString()

        return view
    }

}