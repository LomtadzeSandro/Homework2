package com.example.home_work2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    //private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    val navHostFragment = supportFragmentManager
    //        .findFragmentById(R.id.display_fragment) as NavHostFragment
    //    navController = navHostFragment.navController

        supportFragmentManager.beginTransaction().replace(R.id.display_fragment,HomeFragment()).commit()

    }
}